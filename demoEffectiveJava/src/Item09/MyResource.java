package Item09;

public class MyResource implements AutoCloseable{
    public void doSomething(){
        System.out.println("Do something");
        throw new FirstError();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close My Resource");
        throw new SecondError();

    }
}
