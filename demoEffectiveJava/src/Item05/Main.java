package Item05;

public class Main {

    public static void main(String[] args) {
//        SpellChecker_StaticUtil.isValid("hello");
        SpellChecker_Singleton.INSTANCE.isValid("hello");
    }
}
