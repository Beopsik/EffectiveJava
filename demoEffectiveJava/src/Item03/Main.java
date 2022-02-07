package Item03;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args){
        Elvis elvis1 = Elvis.instance;
        Elvis elvis2 = Elvis.instance;

        System.out.println(elvis1);
        System.out.println(elvis2);

        try {
            Constructor<Elvis> constructor = Elvis.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Elvis elvis3 = constructor.newInstance();
            System.out.println(elvis3);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
