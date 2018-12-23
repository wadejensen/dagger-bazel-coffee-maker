package com.example.auto;

import com.example.coffee.CoffeeMaker;

public class AutomaticDICoffeeApp {
    public static void main(String[] args) {
        ServiceLocator locator = DaggerServiceLocator.create();
        CoffeeMaker coffeeMaker = locator.coffeeMaker();
        coffeeMaker.brew();
    }
}
