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
            sum = sum + food.getPrice() * food.getAmount();
        }
        return sum;
    }

    public double AmountWithDiscount(Food[] foods) {
        double sum = 0;

        for (Food food : foods) {
            sum = sum + (food.getPrice() - food.getPrice() * (food.getDiscount() / 100)) * food.getAmount();
        }
        return sum;
    }

    public double AmountIsVegetarianWithoutDiscount(Food[] foods) {
        double sum = 0;


        for (Food food : foods) {
            if (food.isVegetarian())
                sum = sum + food.getPrice() * food.getAmount();
        }
        return sum;
    }
}
