package model;

import model.constants.Discount;

public abstract class Food implements Discountable{
    protected int amount; //количество продукта в килограммах
    protected double price; //цена за килограмм
    protected boolean isVegetarian; //вегетарианский ли продукт

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double getDiscount() {
        return Discount.DEFAULT;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getTotalPrice(){
        return price*amount;
    }

    public double getTotalDiscountPrice(){
        return price*amount*(1-getDiscount());
    }
}
