package com.example.auto;

import com.example.coffee.ElectricHeater;
import com.example.coffee.Heater;
import com.example.coffee.Pump;
import com.example.coffee.Thermosiphon;
import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeMakerModule {
  @Provides
  static Heater provideHeater() {
    return new ElectricHeater();
  }

  @Provides
  static Pump providePump(Thermosiphon pump) {
    return pump;
  }
}


