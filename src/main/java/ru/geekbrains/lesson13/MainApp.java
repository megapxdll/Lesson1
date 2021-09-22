package ru.geekbrains.lesson13;


import java.io.BufferedOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;

public class MainApp {
    private static final Object lock = new Object();
    public static final CountDownLatch cdl = new CountDownLatch(4);
    public static final int CARS_COUNT = 4;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        Thread[] threads = new Thread[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
            threads[i] = new Thread(cars[i]);
        }
        for (int i = 0; i < cars.length; i++) {
            threads[i].start();
        }
        try {
            Thread.sleep(1500);
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < cars.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        }
    }