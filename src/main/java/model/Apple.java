package model;

public class Apple extends Food{
    public Apple(int amount, double price, String colour){
        this.price = price;
        this.amount = amount;
        isVegetarian = true;
    }
}
