package Item02;

public class NutritionFacts {
    private int servingSize;
    private int sodium;
    private int carbohydrate;
    private int servings;

    //생성자
    public NutritionFacts(int servingSize, int sodium, int carbohydrate, int servings) {
        this.servingSize = servingSize;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
        this.servings = servings;
    }

    //Setter
    public NutritionFacts() {
    }
    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }
    public void setSodium(int sodium) {
        this.sodium = sodium;
    }
    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
    public void setServings(int servings) {
        this.servings = servings;
    }
    
    //Builder
    public static class Builder {
        // 필수 매개변수
        private final int servingSize;
        private final int servings;

        // 선택 매개변수 - 기본값으로 초기화한다.
        private int sodium        = 0;
        private int carbohydrate  = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings    = servings;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }
        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
    private NutritionFacts(Builder builder) {
        servingSize  = builder.servingSize;
        servings     = builder.servings;
        sodium       = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        //생성자는 코드 작성하거나 읽기가 어려움.
        NutritionFacts nutritionFacts=new NutritionFacts(1,6,10,20);

        /*
        * Setter의 장점은 무엇을 초기화하는지 명확하다는 것이다.
        * 그러나 단점은 코드가 장황하고, 자바빈이 중간에 사용하는 경우 안정적이지 않은 상태로 사용될 여지가 있다.
        * 또한 Setter가 있어서 불변 클래스로 만들지 못한다는 치명적인 단점이 있다.
        * 스레드 안정성을 보장하려면 추가적인 수고(locking 같은)가 필요하다.
        * 이러한 단점을 완화하려면 freezing을 사용할 수 있는데 실전에서 거의 쓰지 않는다. 백기선님도 잘 모른다고 한다.
        */
        NutritionFacts cocaCola=new NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCarbohydrate(27);
        cocaCola.setSodium(35);

        /*
        * 빌더 패턴은 생성자의 안정성과 자바빈(Setter)의 가독성 두 가지 장점을 모두 겸비한 방법이다.
        * 빌더 패턴은 만들려는 객체를 바로 만들지 않고 클라이언트는 빌더에 필수적인 매개변수를 주면서 호출해 Builder 객체를 얻는다.
        * 그 다음 Builder 객체가 제공하는 Setter와 비슷한 메소드를 사용해서 부가적인 필드를 채워넣는다.
        * 최종적으로 build 라는 메소드를 호출해서 만들려는 객체를 생성한다.
        */
        NutritionFacts hamburger=new Builder(240, 8)
                .carbohydrate(20).sodium(20).build();
                


    }
}
