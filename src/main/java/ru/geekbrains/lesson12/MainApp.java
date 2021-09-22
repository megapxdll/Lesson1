package ru.geekbrains.lesson12;

import java.util.Arrays;

public class MainApp {
    /**
     * Global values
     */
    static final int size = 10000000;
    static final int HALF = size/2;

    public static void main(String[] args) {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        //Task1(arr);
        Task2(arr);

    }

    public static void MathCalculations(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void Task1(float[] arr) {

        long a = System.currentTimeMillis();
        MathCalculations(arr);
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void Task2(float[] arr) {
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);
        long firstPoint = System.currentTimeMillis() - a;
        Thread firstThread = new Thread(() -> {
            MathCalculations(a1);
        });
        Thread secondThread = new Thread(() -> {
            MathCalculations(a2);
        });
        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        long secondPoint = System.currentTimeMillis() - a;
        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);
        long lastPoint = System.currentTimeMillis() - a;
        System.out.println("Array division time = " + firstPoint);
        System.out.println("Array calculations time = " + secondPoint);
        System.out.println("Array join time = " + lastPoint);

    }
}
