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

    //호출될 때마다 인스턴스를 새로 생성하지 않아도 된다.
    private static final Foo GOOD_NIGHT=new Foo();

    //유연성
    public static Foo getFoo(boolean flag){
        return flag ? new Foo(): new BarFoo();
    }

    public static Foo getFoo(String str){
        Foo foo=new Foo();

        //TODO 어떤 특정 약속 되어 있는 텍스트 파일에서 Foo의 구현체의 FQCN을 읽어온다.
        //TODO FQCN에 해당하는 인스턴스를 생성한다.
        //TODO foo 변수를 해당 인스턴스를 가리키도록 수정한다.

        return foo;
    }
    public static Foo getFoo(){
        return GOOD_NIGHT;
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
