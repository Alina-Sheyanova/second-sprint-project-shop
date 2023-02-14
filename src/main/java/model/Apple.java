package model;

import model.constants.Colour;

import static model.constants.Discount.*;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return (Colour.RED.equals(colour)) ? DISCOUNT_RED : DISCOUNT_ALL;
    }
}
