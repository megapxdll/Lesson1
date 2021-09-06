package ru.geekbrains.lesson6;

public class Dog extends Animal{
    /**
     * Global values
     */
    private final int maxRun_length = 500;
    private final int maxSwim_length = 10;

    public Dog(String name) {
        super(name);
    }

    /**
     * Motion method Run
     */
    public void Run(int length) {
        if(length <= maxRun_length)
            System.out.println("Dog runs: " + length + "m");
        else {
            System.out.println("Dog cannot run more than 500m");
        }
    }

    /**
     * Motion method Swim
     */
    public void Swim(int length) {
        if(length <= maxSwim_length)
            System.out.println("Dog runs: " + length + "m");
        else {
            System.out.println("Dog cannot swim more than 10m");
        }
    }
}
