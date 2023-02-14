import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.*;


public class Main {

    public static void main(String[] args) {

        Food meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, RED);
        Apple appleGreen = new Apple(8, 60, GREEN);

        Food[] foods = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart = new ShoppingCart(foods);


        System.out.println("Общая сумма товаров в корзине без скидки: " + shoppingCart.amountWithoutDiscount(foods) + " рублей");
        System.out.println("Общая сумма товаров в корзине со скидкой: " + shoppingCart.amountWithDiscount(foods) + " рублей");
        System.out.println("Общая сумма всех вегатерианских продуктов в корзине без скидки: " + shoppingCart.amountIsVegetarianWithoutDiscount(foods) + " рублей");

    }


}
