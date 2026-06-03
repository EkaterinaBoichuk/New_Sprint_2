import model.Meat;
import model.Apple;
import model.Food;
import service.ShoppingCart;
import model.constants.Colour;


public class Main {

    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple appleR = new Apple(10, 50, Colour.RED);
        Apple appleZ = new Apple(8, 60, Colour.GREEN);

        Food[] products = new Food[]{meat, appleR, appleZ};
        ShoppingCart cart = new ShoppingCart(products);


        System.out.println(cart.getTotalPrice());
        System.out.println(cart.getTotalPriceWithDiscount());
        System.out.println(cart.getTotalVegetarianPrice());


    }
}
