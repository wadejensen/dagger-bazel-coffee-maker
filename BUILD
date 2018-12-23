java_binary(
    name = "automatic_coffee_app",
    srcs = [
        "src/main/java/com/example/auto/AutomaticDICoffeeApp.java",
        "src/main/java/com/example/auto/CoffeeMakerModule.java",
        "src/main/java/com/example/auto/ServiceLocator.java",
    ],
    main_class = "com.example.auto.AutomaticDICoffeeApp",
    deps = [
        ":coffee",
        "@javax_inject_javax_inject//jar",
        "@com_google_guava_guava//jar",
        "@com_google_dagger//:dagger_with_compiler",
    ],
)

java_binary(
    name = "manual_coffee_app",
    srcs = ["src/main/java/com/example/manual/ManualDICoffeeApp.java"],
    main_class = "com.example.manual.ManualDICoffeeApp",
    deps = [":coffee"],
)

java_library(
    name = "coffee",
    srcs = glob(["src/main/java/com/example/coffee/*.java"]),
    deps = [
        "@javax_inject_javax_inject//jar",
        "@com_google_guava_guava//jar",
        "@com_google_dagger//:dagger_with_compiler",
    ],
)

