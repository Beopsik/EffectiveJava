import Item01.Foo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi~! I'm main class!");

        Foo foo1 = new Foo("beobsik");

        Foo foo2 = Foo.withName("beobsik1");
    }
}
