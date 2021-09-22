package ru.geekbrains.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> wrong_arr = Arrays.asList(2, 1, 2, 1, 2);
        List<Integer> array = Arrays.asList(1, 2, 0, 5, 4, 8, 12, 4, 3, 1, 4, 6, 6, 5);
        ArrayFilter(wrong_arr);
        ArrayFilter(array);
    }

    public static void ArrayFilter(List<Integer> arr) {
        Check4inArray(arr);
        List<Integer> new_arr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 4) {
                new_arr.clear();
                for (int j = i + 1; j < arr.size(); j++) {
                    new_arr.add(arr.get(j));
                }
            }
        }
        for (int i = 0; i < new_arr.size(); i++) {
            System.out.println(new_arr.get(i));
        }
    }

    public static void Check4inArray (List<Integer> arr) {
            if(!arr.contains(4)) {
                throw new RuntimeException("Array does not contains number 4");
            }
    }
}
