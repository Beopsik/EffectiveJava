package Item03;

import java.lang.reflect.Constructor;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args){
        Singleton1 singleton11 = Singleton1.instance;
        Singleton1 singleton12 = Singleton1.instance;

        System.out.println(singleton11);
        System.out.println(singleton12);

        // 리플렉션 공격 코드
//        try {
//            Constructor<Singleton1> constructor = Singleton1.class.getDeclaredConstructor();
//            constructor.setAccessible(true);
//            Singleton1 singleton13 = constructor.newInstance();
//            System.out.println(singleton13);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        Singleton2 singleton3=Singleton2.getInstance();
        Singleton2 singleton4=Singleton2.getInstance();
        System.out.println(singleton3);
        System.out.println(singleton4);

        //정적 팩터리의 메서드 참조(Singleton2.getInstance())를 공급자(supplier)로 사용할 수 있다.
        Supplier<Singleton2> s2supplier=Singleton2::getInstance;
    }
}
