package model;

import model.constants.Discount;

public class Apple extends Food implements Discountable {

    private static final String RED = "red";
    private String colour;
    public Apple (int amount, double price, String colour) {
        super(amount, price,true);
        this.colour = colour;
    }

    public double getDiscount() {
        if (colour.equals(RED)) {
            return Discount.FOR_RED;
        } else {
            return 0;
        }
    }
}

