package classloader;


public class Sample {

    public Sample(){
        System.out.println("Sample is loaded by " + this.getClass().getClassLoader());
       // new A();
    }
}
