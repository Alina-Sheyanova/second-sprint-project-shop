package service;
import model.Food;

public class ShoppingCart {

    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }


    public double AmountWithoutDiscount(Food[] foods) {
        double sum = 0;

        for (Food food : foods) {
            sum = sum + food.price;
        }
        return sum;
    }

    private double AmountWithDiscount(Food[] foods, int discount) {
        double sum = 0;

        for (Food food : foods) {
            sum = sum + food.price;
        }

        return sum - sum*(discount/100);
    }

    private double AmountIsVegetarianWithoutDiscount(Food[] foods, boolean isVegetarian) {
        double sum = 0;

        if (isVegetarian) {
            for (Food food : foods) {
                sum = sum + food.price;
            }
        }
        return sum;
    }
}
