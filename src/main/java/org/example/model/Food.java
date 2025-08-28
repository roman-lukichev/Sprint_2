package org.example.model;

public abstract class Food implements Discountable{
    protected int amount; //количество продукта в килограммах
    protected double price; //цена за килограмм
    protected boolean isVegetarian; //вегетарианский ли продукт

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
