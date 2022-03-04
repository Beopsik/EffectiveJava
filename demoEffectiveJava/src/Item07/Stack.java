package Item07;

import java.util.Arrays;
import java.util.EmptyStackException;

//메모리 누수가 일어나는 스택
public class Stack {
    private Object[] elements;
    private int size=0;
    private static final int DEFAULT_INITIAL_CAPACITY=16;

    public Stack(){
        elements=new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++]=e;
    }

    //pop() 코드에서 실제로 객체를 지우는 것이 아니라 size만 변경하고 있다. 필요없는 객체를 스택 안에 여전히 존재하는 것이다.
//    public Object pop(){
//        if(size==0)
//            throw new EmptyStackException();
//
//        return elements[--size];
//    }

    public Object pop(){
        if(size==0)
            throw new EmptyStackException();
        Object result = this.elements[--size];
        this.elements[size]=null;

        return result;
    }

    public void Example(){
        Object age=13;
        age=null;
    }

    private void ensureCapacity(){
        if(elements.length==size)
            elements= Arrays.copyOf(elements, 2*size+1);
    }
}
