package ru.geekbrains.lesson2;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainApp {
    /**
     * Global values
     */
    static int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};


    public static void main(String[] args) {
        System.out.println("Task 1: " );
        DoTask1();
        System.out.println("Task 2: " );
        DoTask2();
        System.out.println("Task 3: " );
        DoTask3();
        System.out.println("Task 4: " );
        DoTask4();
        System.out.println("Task 5: " );
        DoTask5();
        System.out.println("Task 6: " + DoTask6(arr6));
    }

    /**
     * Task 1
     */
    static void DoTask1() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    /**
     * Task 2
     */
    static void DoTask2() {
        int[] arr2 = new int[8];
        int num = 0;
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = num;
            System.out.print(arr2[i] + " ");
            num += 3;
        }
        System.out.println();
    }

    /**
     * Task 3
     */
    static  void DoTask3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] < 6) {
                arr3[i] *= 2;
            }
            System.out.print((arr3[i]) + " ");
        }
        System.out.println();
    }

    /**
     * Task 4
     */
    static void DoTask4() {
        int n = 3;
        int[][] arr4 = new int[n][n];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][i] = 1;
                arr4[i][n-1-i] = 1;
                System.out.print(arr4[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * Task 5
     */
    static void DoTask5() {
        int[] arr5 = new int[6];
        Random number = new Random();
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = number.nextInt(10);
            System.out.print(arr5[i] + " ");
        }

        int min_value = arr5[0];
        int max_value = arr5[0];
        for (int i = 0; i < arr5.length; i++) {

            if (min_value > arr5[i]) {
                min_value = arr5[i];
            }

            if (max_value < arr5[i]) {
                max_value = arr5[i];
            }
        }
        System.out.println();
        System.out.println("Minimum value: " + min_value);
        System.out.println("Maximum value: " + max_value);
    }

    /**
     * Task 6
     */
    static boolean DoTask6(int[] arr) {
        int LeftSide = 0;
        int RightSide = arr[arr.length-1] + arr[arr.length-2];
        for (int i = 0; i < arr.length; i++) {
            LeftSide += arr[i];
            if(LeftSide == RightSide) {
                return true;
            } else if (i == arr.length-2 ) {
                return false;
            }
        }
        return false;
    }
}

