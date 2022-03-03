package Item06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //불필요한 객체 생성을 하는 극단적인 예
        String name1=new String("beobsik");
        String name2=new String("beobsik");

        //객체 비교
        System.out.println(name1==name2);
        
        //객체 내용 비교
        System.out.println(name1.equals(name2));

        System.out.println("-----------------------------");

        //올바른 예
        String name3="beobsik";
        String name4="beobsik";

        //객체 비교
        System.out.println(name3==name4);

        //객체 내용 비교
        System.out.println(name3.equals(name4));

        System.out.println("-----------------------------");

        Boolean true1=Boolean.valueOf("true");
        Boolean true2=Boolean.valueOf("true");

        //객체 비교
        System.out.println(true1==true2);

        //객체 내용 비교
        System.out.println(true1.equals(true2));

        System.out.println("-----------------------------");

        Map<String, Integer> menu=new HashMap<>();
        menu.put("Burger", 8);
        menu.put("Pizza", 9);

        Set<String> keySet1=menu.keySet();
        Set<String> keySet2=menu.keySet();

        keySet1.remove("Burger");
        System.out.println(keySet2.size());
        System.out.println(menu.size());

        System.out.println("-----------------------------");

        long start1=System.currentTimeMillis();
        Long sum1=0l;
        for(long i=0; i<=Integer.MAX_VALUE; i++){
            sum1+=i;
        }
        System.out.println(sum1);
        System.out.println(System.currentTimeMillis()-start1+"ms");

        System.out.println("-----------------------------");

        long start2=System.currentTimeMillis();
        long sum2=0l;
        for(long i=0; i<=Integer.MAX_VALUE; i++){
            sum2+=i;
        }
        System.out.println(sum2);
        System.out.println(System.currentTimeMillis()-start2+"ms");
    }
}
