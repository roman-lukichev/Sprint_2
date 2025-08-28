package org.example.service;

import org.example.model.Food;

public class ShoppingCart {
    protected Food[] food;
    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food i : food) {
            total += i.getAmount() * i.getPrice();
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (Food i : food) {
            total += i.getAmount() * i.getPrice() * (1-i.getDiscount());
        }
        return total;
    }

    public double getTotalVegetarianWithoutDiscount() {
        double total = 0;
        for (Food i : food) {
            total = i.isVegetarian() ? total + i.getPrice() * i.getAmount() : total;
        }
        return total;
    }
}
