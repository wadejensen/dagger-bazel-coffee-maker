package com.example.auto;

import com.example.coffee.ElectricHeater;
import com.example.coffee.Heater;
import com.example.coffee.Pump;
import com.example.coffee.Thermosiphon;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
class CoffeeMakerModule {

  @Singleton // ensures that the CoffeeMaker and the Thermosiphon get the SAME heater
  @Provides
  static Heater provideHeater() {
    return new ElectricHeater();
  }

  @Provides
  static Pump providePump(Thermosiphon pump) {
    return pump;
  }
}


