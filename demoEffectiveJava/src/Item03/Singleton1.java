package Item03;

public class Singleton1 {
    public static final Singleton1 instance=new Singleton1();

    private Singleton1(){
        // 리플렉션 공격 방어 코드
        if(instance!=null){
            throw new IllegalStateException("this object should be singleton");
        }
    }
}
