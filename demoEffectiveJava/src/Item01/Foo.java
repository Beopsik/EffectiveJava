package Item01;

public class Foo {

    private String name;

    private String address;

    public Foo() {
    }

    public Foo(String name) {
        this.name=name;
    }

    //이름을 가질 수 있다.
    public static Foo withName(String name){
        return new Foo(name);
    }

    //동일한 시그니처의 생성자를 여러 개 만들 수 없기 때문에 static 팩토리 메소드를 사용할 수 있다.
    public static Foo withAddress(String address){
        Foo foo = new Foo();
        foo.setAddress(address);
        return foo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
