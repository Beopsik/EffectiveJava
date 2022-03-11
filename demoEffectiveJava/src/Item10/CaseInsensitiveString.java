package Item10;

import java.util.Objects;

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s){
        this.s= Objects.requireNonNull(s);
    }

    /**
     * 대칭성 위반 코드
     * @param o
     * @return boolean
     */
//    @Override
//    public boolean equals(Object o){
//        if(o instanceof CaseInsensitiveString){
//            return  s.equalsIgnoreCase(((CaseInsensitiveString)o).s);
//        }
//        if(o instanceof String){
//            return s.equalsIgnoreCase((String) o);
//        }
//        return false;
//    }


    /**
     * CaseInsensitiveString의 equals를 String과 연동한다는 미친 짓은 하지말아야한다. 아래의 코드와 같이 짜면 된다.
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString && ((CaseInsensitiveString)o).s.equalsIgnoreCase(s);
    }
}
