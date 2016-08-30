package classloader;

public class A {

    public A(){
        System.out.println("A is loaded by " + this.getClass().getClassLoader());
    }
}