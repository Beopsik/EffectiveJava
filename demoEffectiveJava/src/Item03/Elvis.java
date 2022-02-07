package Item03;

public class Elvis {
    public static final Elvis instance=new Elvis();

    private Elvis(){
        if(instance!=null){
            throw new IllegalStateException("this object should be singleton");
        }
    }
}
