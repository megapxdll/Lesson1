package ru.geekbrains.lesson6;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void Run(int length);

    public abstract void Swim(int length);

}


