package ru.geekbrains.lesson6;

public class MainApp {
    private int counter = 0;

    public static void main(String[] args) {
        Cat cat = new Cat("Boris");
        Cat cat2 = new Cat("Savok");
        Dog dog = new Dog("Wopper");
        Dog dog2 = new Dog("Dopper");
        Dog dog3 = new Dog("Hopper");
        cat.Run(150);
        cat.Swim(10);
        dog.Run(400);
        dog.Swim(10);
    }
}
