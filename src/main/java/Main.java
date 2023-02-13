import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import java.lang.reflect.Member;

public class Main {

    public static void main(String[] args) {

        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, "red");
        Food appleGreen = new Apple(8, 60, "green");

        Food[] foods = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров в корзине без скидки: " + shoppingCart.AmountWithoutDiscount(foods));
        System.out.println("Общая всех вегетарианских продуктов товаров в корзине без скидки: " + shoppingCart.AmountIsVegetarianWithoutDiscount(foods));

    }


}
