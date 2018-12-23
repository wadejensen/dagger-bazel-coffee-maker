package com.example.auto;

import com.example.coffee.CoffeeMaker;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Tells Dagger to generate a class, `DaggerServiceLocator` with two public methods:
 *    a 'magic' `create` method, which returns an instance of `ServiceLocator`
 *    a builder method which returns a `ServiceLocator` if dependencies need to be specified manually
 *
 * At compile-time Dagger traverses the dependency graphs for all method return types in
 * `ServiceLocator`, looking for @Provides annotations in the specified modules which satisfy the
 * dependency graph. Then at compile time it generates the necessary factory boilerplate to provide
 * instances for all method return types.
 */
@Singleton
@Component(modules = { CoffeeMakerModule.class })
public interface ServiceLocator {
  CoffeeMaker coffeeMaker();
  // Insert other services to be injected here:
  // ...
  // ...
  // ...
}
