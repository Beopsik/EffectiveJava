package Item08;

public class Main {
    public static void main(String[] args) throws InterruptedException{
//        FinalizerExample finalizerExample=new FinalizerExample();
//        finalizerExample.hello();
//        SampleResource sampleResource=null;
//        try {
//            sampleResource=new SampleResource();
//            sampleResource.hello();
//        }finally {
//            if(sampleResource!=null)
//                sampleResource.close();
//        }
        //try with 
        //이상적인 자원 반납 방법
        try (CleanerSample cleanerSample=new CleanerSample()){
            cleanerSample.doSomething();
        }
    }
}
