package service;

import model.Food;

public class ShoppingCart {
    private final Food[] food;
    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food i : food) {
            total += i.getTotalPrice();
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (Food i : food) {
            total += i.getTotalDiscountPrice();
        }
        return total;
    }

    public double getTotalVegetarianWithoutDiscount() {
        double total = 0;
        for (Food i : food) {
            total = i.isVegetarian() ? total + i.getTotalPrice() : total;
        }
        return total;
    }
}
