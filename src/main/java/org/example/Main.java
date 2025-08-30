package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var meat = new Meat(5, 100);
        var redApple = new Apple(10, 50, Colour.RED);
        var greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] food = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.println("Стоимость всех продуктов без скидки: " + shoppingCart.getTotalWithoutDiscount() + " рублей");
        System.out.println("Стоимость всех продуктов со скидкой: " + shoppingCart.getTotalWithDiscount() + " рублей");
        System.out.println("Стоимость вегетарианских продуктов без скидки: " + shoppingCart.getTotalVegetarianWithoutDiscount() + " рублей");
    }
}