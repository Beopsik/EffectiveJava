package Item01;

public class Foo {

    String name;

    public Foo(String name) {
        this.name=name;
    }

    //이름을 가질 수 있다.
    public static Foo withName(String name){
        return new Foo(name);
    }
}
