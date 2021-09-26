package ru.geekbrains.lesson13;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    final int THREAD_COUNT = 4;
    static boolean isWinner = true;
    private static int CARS_COUNT;
    public static final CountDownLatch cdl = new CountDownLatch(4);
    public static final CyclicBarrier cb = new CyclicBarrier(4);
    private Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCarsCount() {
        return CARS_COUNT;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
            if (i == race.getStages().size() - 1 && isWinner == true) {
                isWinner = false;
                System.out.println(getWinner());
            }
        }
    }
    public String getWinner() {
        return this.name + " ПОБЕДИТЕЛЬ!!!";
    }
}