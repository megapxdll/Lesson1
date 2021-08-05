package ru.geekbrains.lesson1;

import java.util.Scanner;

public class MainApp {
    /**
     * Entry Point
     */
    public static void main(String[] args) { // Task 1
        DoTask2(); //Task 2
        DoTask3(); //Task 3
        DoTask4(); //Task 4
        DoTask5(); //Task 5
        DoTask6(); //Task 6
        DoTask7(); //Task 7
        DoTask8(); //Task 8
    }

    /**
     * 2 Task
     */
    static void DoTask2() {
        byte value1 = 'c';
        byte value2 = 8;
        short value3 = 148;
        int value4 = 10666;
        long value5 = 546985;
        float value6 = 1256.678f;
        double value7 = 14567.1245;
        char value8 = 'G';
        char value9 = '3';
        boolean value10 = true;
        String value11 = "Hello World";
        System.out.println("Byte value 1: " + value1);
        System.out.println("Byte value 2: " + value2);
        System.out.println("Short value 3: " + value3);
        System.out.println("Integer value 4: " + value4);
        System.out.println("Long value 5: " + value5);
        System.out.println("Float value 6: " + value6);
        System.out.println("Double value 7: " + value7);
        System.out.println("Char value 8: " + value8);
        System.out.println("Char value 9: " + value9);
        System.out.println("Boolean value 10: " + value10);
        System.out.println("String value 11: " + value11);
    }

    /**
     * 3 Task
     */
    static void DoTask3() {
        Expression(); // Task 3
        System.out.println("Result 2: " + Expression(123.4f, 23.6f, 34.6f, 12.8f)); // Task 3 Alternative
    }
    static float Expression(float a, float b, float c, float d) {
        return a * (b + (c/d));
    }
    static void Expression() {
        float a = 15.6f;
        float b = 32.8f;
        float c = 45.1f;
        float d = 15;
        float result = a * (b + (c/d));
        System.out.println("Result: " + result);
    }

    /**
     * 4 Task
     */
    static void DoTask4() {
        System.out.println("Is sum is in interval: " + isSumInInterval(5, 5)); // Task 4 result true
        System.out.println("Is sum is in interval: " + isSumInInterval(2, 3)); // Task 4 result false
        System.out.println("Is sum is in interval: " + isSumInInterval(10, 10)); // Task 4 result true
        System.out.println("Is sum is in interval: " + isSumInInterval(20, 30)); // Task 4 result false
    }
    static boolean isSumInInterval(int a, int b) {
        int sum = a + b;
        if(sum >= 10 && sum <= 20) {
            return true;
        }
        return  false;
    }

    /**
     * 5 Task
     */
    static void DoTask5() {
        System.out.println(PosOrNeg(5)); // Task 5 Positive
        System.out.println(PosOrNeg(-8)); // Task 5 Negative
        System.out.println(PosOrNeg(0)); // Task 5 Positive
    }
    static String PosOrNeg(int a) {
        if (a < 0) {
            return "The value is negative";
        }
        return "The value is positive";
    }

    /**
     * 6 Task
     */
    static void DoTask6() {
        System.out.println("Is value is negative: " + isNeg(-8)); // Task 6 True
        System.out.println("Is value is negative: " + isNeg(8)); // Task 6 False
    }
    static boolean isNeg(int a) {
        if(a < 0) {
            return true;
        }
        return false;
    }

    /**
     * 7 Task
     */
    public static String name = "Алексей";
    static void DoTask7() {
        Hello(name);
        Hello("Макс");
    }
    static void Hello(String name) {
        System.out.println("Привет, " + name);
    }

    /**
     * 8 Task
     */
    static void DoTask8() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scan.nextInt();
        System.out.println(isLeap(year));
    }
    static String isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return "Этот год является высокосным";
        }
        return "Этот год не является высокосным";
    }
}
