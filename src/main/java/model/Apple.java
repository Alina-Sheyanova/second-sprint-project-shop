package model;

import model.constants.Colour;

import static model.constants.Discount.*;

public class Apple extends Food {

    protected String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return DISCOUNT_RED;
        }

        return DISCOUNT_ALL;
    }
}
