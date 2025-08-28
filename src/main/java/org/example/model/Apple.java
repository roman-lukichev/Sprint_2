package org.example.model;

import org.example.model.constants.Colour;
import org.example.model.constants.Discount;

public class Apple extends Food implements Discountable{
    protected String color;

    public Apple(int amount, double price, String color) {
        super(amount, price);
        this.color = color;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        return color.equals(Colour.RED) ? Discount.DISCOUNT_60 : Discount.DISCOUNT_0;
    }
}
