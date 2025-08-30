package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        return Colour.RED.equals(color) ? Discount.RED_APPLE : Discount.DEFAULT; //использую тернарное выражение для сокращения кода
    }
}
