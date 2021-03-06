package com.example.coffee;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Thermosiphon implements Pump {
  private final Heater heater;

  @Inject
  public Thermosiphon(Heater heater) {
    this.heater = heater;
  }

  @Override
  public void pump() {
    if (heater.isHot()) {
      System.out.println("=> => pumping => =>");
    }
  }
}
