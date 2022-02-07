package Item03;

public class Singleton2 {
    private static final Singleton2 instance=new Singleton2();

    private Singleton2(){

    }

    public static Singleton2 getInstance() {
        return instance;
        // 정적 팩터리 방식의 첫 번째 장점: API(여기서는 getInstance라는 함수명)를 바꾸지 않고도 싱글턴이 아니게 변경할 수 있다는 점
//        return new Singleton2();
    }
}
