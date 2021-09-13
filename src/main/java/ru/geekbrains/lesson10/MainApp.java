package ru.geekbrains.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainApp {
    /**
     * Global values
     */
    public static int count = 0;

    public static void main(String[] args) {
        doTask1();
        doTask2();
    }

    // Exercise 1:
    public static void doTask1() {
        /**
         * words: Array of words with duplicates
         * Unique_words: Array of unique words from "words"
         * number_of_duplicates: Array with counts of words by index
         */
        List<String> words = new ArrayList<>(Arrays.asList("Aries", "Taurus", "Gemini", "Cancer",
                "Lion","Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn",
                "Acquarius", "Pisces", "Taurus", "Lion", "Sagittarius", "Gemini", "Libra"));
        List<String> Unique_words = new ArrayList();
        List<Integer> number_of_duplicates = new ArrayList(words.size());

        // Filling Unique_words with words from "words" array
        for (int i = 0; i < words.size(); i++) {
            if(!Unique_words.contains(words.get(i))) {
                Unique_words.add(words.get(i));
            }
        }
        // Output of unique words
        System.out.printf("Unique words from array of words: %s%n", Unique_words);
        System.out.println();

        // Algorithm for counting every word in "words" array
        for (int i = 0; i < Unique_words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                if(Unique_words.get(i).contains(words.get(j))) {
                    count++;
                    number_of_duplicates.add(i);
                    number_of_duplicates.set(i, count);
                }
            }
            count = 0;
            System.out.printf("Count of %s is: %s%n", Unique_words.get(i), number_of_duplicates.get(i));
        }
    }

    // Exercise 2 (Testing):
    public static void doTask2() {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.AddPhone("Kokolev", "12415");
        phoneDirectory.AddPhone("Kravec", "978660");
        phoneDirectory.AddPhone("Fabellini", "549-32");
        phoneDirectory.AddPhone("Kravec", "54214");
        phoneDirectory.Get("Kravec");
    }


}
