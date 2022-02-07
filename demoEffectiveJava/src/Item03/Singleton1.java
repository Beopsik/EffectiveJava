package Item03;

public class Singleton1 {
    public static final Singleton1 instance=new Singleton1();

    private Singleton1(){
        if(instance!=null){
            throw new IllegalStateException("this object should be singleton");
        }
    }
}
