package Item13;

public class HashTable implements Cloneable {
    private Entry[] bukets =...;

    //    private static class Entry{
//        final Object key;
//        Object value;
//        Entry next;
//
//        Entry(Object key, Object value, Entry next){
//            this.key=key;
//            this.value=value;
//            this.next=next;
//        }
//    }
//
//    // 잘못된 clone 메서드 - 가변 상태를 공유한다.
//    @Override
//    public HashTable clone(){
//        try {
//            HashTable result=(HashTable) super.clone();
//            result.bukets=bukets.clone();
//            return result;
//        }catch (CloneNotSupportedException e){
//            throw new AssertionError();
//        }
//    }
    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

//        Entry deepCopy(){
//            return new Entry(key, value, next ==null ? null: next.deepCopy());
//        }
        Entry deepCopy(){
            Entry result=new Entry(key, value, next);
            for(Entry p=result; p.next!=null; p=p.next){
                p.next=new Entry(p.next.key, p.next.value, p.next.next);
            }
            return result;
        }
    }

    // 복잡한 가변 상태를 갖는 클래스용 clone 메서드
    @Override
    public HashTable clone(){
        try {
            HashTable result=(HashTable) super.clone();
            result.bukets = new Entry[bukets.length];
            for(int i=0; i< bukets.length; i++){
                if(bukets[i]!=null)
                    result.bukets[i]=bukets[i].deepCopy();
            }
            return result;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
