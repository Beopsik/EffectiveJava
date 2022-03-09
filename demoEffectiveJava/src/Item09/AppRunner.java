package Item09;

public class AppRunner {
    public static void main(String[] args) throws Exception {
        /**
         * 고전적인 예외 처리 방법
         */
        MyResource myResource=new MyResource();
        try {
            myResource.doSomething();
        }finally {
            myResource.close();
        }
    }
}
