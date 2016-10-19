package com.zy.Factory;


/**
 * 
 * 创建方法返回一个可以用来创建抽象类或接口的工厂类。
 */
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactoryConfigurationException;
import javax.xml.xpath.XPathFunctionException;
import javax.xml.xpath.XPathFunctionResolver;
import javax.xml.xpath.XPathVariableResolver;

public abstract class XPathFactory  {


    public static final String DEFAULT_PROPERTY_NAME = "javax.xml.xpath.XPathFactory";

    public static final String DEFAULT_OBJECT_MODEL_URI = "http://java.sun.com/jaxp/xpath/dom";

   
    private static SecuritySupport ss = new SecuritySupport() ;


    protected XPathFactory() {
    }


    public static XPathFactory newInstance() {

        try {
                return newInstance(DEFAULT_OBJECT_MODEL_URI);
        } catch (XPathFactoryConfigurationException xpathFactoryConfigurationException) {
                throw new RuntimeException(
                        "XPathFactory#newInstance() failed to create an XPathFactory for the default object model: "
                        + DEFAULT_OBJECT_MODEL_URI
                        + " with the XPathFactoryConfigurationException: "
                        + xpathFactoryConfigurationException.toString()
                );
        }
    }

    
    public static XPathFactory newInstance(final String uri)
        throws XPathFactoryConfigurationException {

        if (uri == null) {
            throw new NullPointerException(
                    "XPathFactory#newInstance(String uri) cannot be called with uri == null");
        }

        if (uri.length() == 0) {
            throw new IllegalArgumentException(
                    "XPathFactory#newInstance(String uri) cannot be called with uri == \"\"");
        }

        ClassLoader classLoader = ss.getContextClassLoader();

        if (classLoader == null) {
            //use the current class loader
            classLoader = XPathFactory.class.getClassLoader();
        }

        XPathFactory xpathFactory = new XPathFactoryFinder(classLoader).newFactory(uri);

        if (xpathFactory == null) {
            throw new XPathFactoryConfigurationException(
                    "No XPathFactory implementation found for the object model: "
                    + uri);
        }

        return xpathFactory;
    }

    public static XPathFactory newInstance(String uri, String factoryClassName, ClassLoader classLoader)
        throws XPathFactoryConfigurationException{
        ClassLoader cl = classLoader;

        if (uri == null) {
            throw new NullPointerException(
                    "XPathFactory#newInstance(String uri) cannot be called with uri == null");
        }

        if (uri.length() == 0) {
            throw new IllegalArgumentException(
                    "XPathFactory#newInstance(String uri) cannot be called with uri == \"\"");
        }

        if (cl == null) {
            cl = ss.getContextClassLoader();
        }

        XPathFactory f = new XPathFactoryFinder(cl).createInstance(factoryClassName);

        if (f == null) {
            throw new XPathFactoryConfigurationException(
                    "No XPathFactory implementation found for the object model: "
                    + uri);
        }
        //if this factory supports the given schemalanguage return this factory else thrown exception
        if (f.isObjectModelSupported(uri)) {
            return f;
        } else {
            throw new XPathFactoryConfigurationException("Factory "
                    + factoryClassName + " doesn't support given " + uri
                    + " object model");
        }

    }
    public abstract boolean isObjectModelSupported(String objectModel);
  
    public abstract void setFeature(String name, boolean value)
            throws XPathFactoryConfigurationException;

    
    public abstract boolean getFeature(String name)
            throws XPathFactoryConfigurationException;

    
    public abstract void setXPathVariableResolver(XPathVariableResolver resolver);

    public abstract XPath newXPath();
}
