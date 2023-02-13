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
            sum = sum + food.getPrice();
        }
        return sum;
    }

    private double AmountWithDiscount(Food[] foods, int discount) {
        double sum = 0;

        for (Food food : foods) {
            // sum = sum + food.price;
        }

        return sum - sum * (discount / 100);
    }

    public double AmountIsVegetarianWithoutDiscount(Food[] foods) {
        double sum = 0;


        for (Food food : foods) {
            if (food.isVegetarian())
                sum = sum + food.getPrice();
        }
        return sum;
    }
}
