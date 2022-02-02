package Item02;

import java.util.EnumSet;
import java.util.Objects;

public abstract class Pizza {
    public enum Topping{
        HAM, MUSHROOM, ONION
    }
    final EnumSet<Topping> toppings;

    //Builder 클래스가 자기 자신의 하위 타입을 받는 Builder 임. 이것을 재귀적인 타입 한정을 이용하는 제너릭 타입이라고 한다.
    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // 하위 클래스는 이 메서드를 재정의(overriding)하여
        // "this"를 반환하도록 해야 한다.
        protected abstract T self();
    }
    Pizza(Builder<?> builder) {
        toppings = builder.toppings;
    }
}
