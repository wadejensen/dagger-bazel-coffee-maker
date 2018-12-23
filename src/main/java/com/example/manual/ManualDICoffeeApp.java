package com.example.manual;

import com.example.coffee.*;

public class ManualDICoffeeApp {
    public static void main(String args[]) {
        Heater electricHeater = new ElectricHeater();
        Pump thermosiphon = new Thermosiphon(electricHeater);
        CoffeeMaker coffeeMaker = new CoffeeMaker(electricHeater, thermosiphon);
        coffeeMaker.brew();
    }
}
