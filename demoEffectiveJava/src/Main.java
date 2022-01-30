import Item01.Foo;

import java.util.EnumSet;

public class Main {
    enum Color{
        RED, BLUE, WHITE
    }

    public static void main(String[] args) {
        System.out.println("Hi~! I'm main class!");

        Foo foo1 = new Foo("beobsik");

        Foo foo2 = Foo.withName("beobsik1");

        //유연성
        System.out.println(Foo.getFoo(true));
        System.out.println(Foo.getFoo(false));

        EnumSet<Color> colors=EnumSet.allOf(Color.class);

        EnumSet<Color> colorEnumSet = EnumSet.of(Color.RED, Color.WHITE);
    }
}
