package ru.geekbrains.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Task 1
        doTask1();
        // Task 2
        doTask2();
    }

    public static void doTask1() {
        ArrayList<Object> stringArrayList = new ArrayList<>(Arrays.asList(new Scanner(System.in), "Gucci", 5));
        Array_Value_Replacer(0, 2, stringArrayList);
        System.out.println(stringArrayList);
    }

    public static void doTask2() {
        Object[] objects = {5, "RolePlay", 51f};
        System.out.println(ArrayToList(objects));
    }
    public static void Array_Value_Replacer (int firstElement, int secElement, ArrayList<Object> arr) {
        Object save_value = arr.get(firstElement);
        arr.set(firstElement, arr.get(secElement));
        arr.set(secElement, save_value);
    }


    public static List ArrayToList(Object[] a) {
        ArrayList<Object> arrayList= new ArrayList<>(a.length);
        for (int i = 0; i < a.length; i++) {
            arrayList.add(i, a[i]);
        }
        return arrayList;
    }
}
