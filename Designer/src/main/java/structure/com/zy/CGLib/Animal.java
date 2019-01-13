package structure.com.zy.CGLib;
interface Animal{
    void sound();
    void bite();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("wong~");
    }
    public void bite()
    {
    	System.out.println("bite");
    }
}