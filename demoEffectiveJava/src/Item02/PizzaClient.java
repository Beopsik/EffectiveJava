package Item02;

public class PizzaClient {
    public static void main(String[] args) {
        NyPizza nyPizza=new NyPizza.Builder(NyPizza.Size.LARGE)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.ONION)
                .build();
    }
}
