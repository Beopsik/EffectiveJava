package Item09;

public class AppRunner {
    public static void main(String[] args) throws Exception {
        /**
         * 고전적인 예외 처리 방법
         */
//        MyResource myResource=new MyResource();
//        try {
//            myResource.doSomething();
//            MyResource newMyResource = null;
//            try{
//                newMyResource=new MyResource();
//                newMyResource.doSomething();
//            }finally {
//                if(newMyResource!=null) {
//                    newMyResource.close();
//                }
//            }
//        }finally {
//            myResource.close();
//        }

        /**
         * try-with-resource
         */
//        try(MyResource myResource=new MyResource()) {
//            myResource.doSomething();
//        }

        try(MyResource myResource1=new MyResource();
            MyResource myResource2=new MyResource()) {
            myResource1.doSomething();
            myResource2.doSomething();
        }
    }
}
