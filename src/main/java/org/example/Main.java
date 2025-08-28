package org.example;

import org.example.model.Apple;
import org.example.model.Food;
import org.example.model.Meat;
import org.example.model.constants.Colour;
import org.example.service.ShoppingCart;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] food = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.println("Стоимость всех продуктов без скидки: " + shoppingCart.getTotalWithoutDiscount() + " рублей");
        System.out.println("Стоимость всех продуктов со скидкой: " + shoppingCart.getTotalWithDiscount() + " рублей");
        System.out.println("Стоимость вегетарианских продуктов без скидки: " + shoppingCart.getTotalVegetarianWithoutDiscount() + " рублей");
    }
}