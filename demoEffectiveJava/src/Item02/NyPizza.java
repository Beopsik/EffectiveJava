package Item02;

import java.util.Objects;

public class NyPizza extends Pizza{

    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        // 하위 클래스의 메서드가 상위 클래스의 메서드가 정의한 반환 타입이 아닌,
        // 그 하위 타입을 반환하는 기능을 공변 반환 타이핑(covariant return typing)이라 한다.
        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size=builder.size;
    }
}
