package classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader{
	//类加载器名称
    private String name;
    //加载类的路径
    private String path = "E:/sourcecode/server/Jvm/bin/classloader/";
    private final String fileType = ".class";
    public MyClassLoader(String name){
        //让系统类加载器成为该 类加载器的父加载器
        super();
        this.name = name;
    }

    public MyClassLoader(ClassLoader parent, String name){
        //显示指定该类加载器的父加载器
        super(parent);
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return this.name;
    }
    /**
     * 获取.class文件的字节数组
     * @param name
     * @return
     */
    private byte[] loaderClassData(String name){
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        this.name = this.name.replace(".", "/");
        try {
        	is=new FileInputStream(new File(path + name + fileType));
        	System.out.println(path + name + fileType);
            int c = 0;
            while(-1 != (c = is.read())){
                baos.write(c);
            }
            data = baos.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                is.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    /**
     * 获取Class对象
     */
    @Override
    public Class<?> findClass(String name){
        byte[] data = loaderClassData(name);
        return this.defineClass(name, data, 0, data.length);
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //loader1的父加载器为系统类加载器
        MyClassLoader loader1 = new MyClassLoader("loader1");
        loader1.setPath("E:/sourcecode/server/Jvm/bin/classloader/");
        //loader2的父加载器为loader1
        MyClassLoader loader2 = new MyClassLoader(loader1, "loader2");
        loader2.setPath("E:/sourcecode/server/Jvm/bin/classloader/");
        //loader3的父加载器为根类加载器
        MyClassLoader loader3 = new MyClassLoader(null, "loader3");
        loader3.setPath("E:/sourcecode/server/Jvm/bin/classloader/");

   //     Class clazz1 = loader1.loadClass("classloader.Sample");
 //      Class clazz2 = loader2.loadClass("classloader.Sample");
        Class clazz3 = loader3.loadClass("A");
 //       Object object1 = clazz1.newInstance();
 //       Object object2 = clazz2.newInstance();
//        Object object3 = clazz3.newInstance();
    }
}

