package model;

import model.constants.Discount;
import model.constants.Colour;

public class Apple extends Food {


    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.FOR_RED;
        } else {
            return 0;
        }
    }
}

