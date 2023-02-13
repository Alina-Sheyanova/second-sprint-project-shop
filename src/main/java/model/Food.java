package model;

public class Food {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
