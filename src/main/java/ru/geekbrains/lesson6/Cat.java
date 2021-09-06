package ru.geekbrains.lesson6;

public class Cat extends Animal{
    /**
     * Global values
     */
    public int maxRun_length = 200;

    public Cat(String name) {
        super(name);
    }

    /**
     * Motion method Run
     */
    public void Run(int length) {
        if(length <= maxRun_length)
            System.out.println("Cat runs: " + length + "m");
        else {
            System.out.println("Cat cannot run more than 200m");
        }
    }

    /**
     * Motion method Swim
     */
    public void Swim(int length) {
        System.out.println("Cat cannot swim");
    }
}
