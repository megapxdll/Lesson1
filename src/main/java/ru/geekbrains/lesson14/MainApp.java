package ru.geekbrains.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    /**
    public static void main(String[] args) {
        List<Integer> wrong_arr = Arrays.asList(2, 1, 2, 1, 2);
        List<Integer> array = Arrays.asList(1, 2, 0, 5, 4, 8, 12, 4, 3, 1, 4, 6, 6, 5);
        //ArrayFilter(wrong_arr);
        ArrayFilter(array);
    }*/

    //Task 1
    public List ArrayFilter(List<Integer> arr) {
            Check4inArray(arr);
            List<Integer> new_arr = new ArrayList<>();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == 4) {
                    new_arr.clear();
                    for (int j = i + 1; j < arr.size(); j++) {
                        new_arr.add(arr.get(j));
                    }
                }
            }
            for (int i = 0; i < new_arr.size(); i++) {
                System.out.println(new_arr.get(i));
            }
            return new_arr;
    }

    public static void Check4inArray (List<Integer> arr) throws  RuntimeException{
            if(!arr.contains(4)) {
                throw new RuntimeException("Array does not contains number 4");
            }
    }

    //Task 2
    public boolean CheckArrayFor1and4 (List<Integer> a) {
        boolean flag = true;
        if (!a.contains(4) || !a.contains(1)) {
            flag = false;
        }
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) == 4  || a.get(i) == 1) {
                continue;
            }
            else {
                flag = false;
            }
        }
        return flag;
    }
}
