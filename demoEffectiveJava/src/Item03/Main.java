package Item03;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args){
        Singleton1 singleton11 = Singleton1.instance;
        Singleton1 singleton12 = Singleton1.instance;

        System.out.println(singleton11);
        System.out.println(singleton12);

        try {
            Constructor<Singleton1> constructor = Singleton1.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton1 singleton13 = constructor.newInstance();
            System.out.println(singleton13);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
