package model.constants;

import model.Discountable;

public class Colour implements Discountable {

    public static final String colourRed = "red";
    public static final String colourGreen = "green";

    @Override
    public double getDiscount() {
        return 0;
    }
}
