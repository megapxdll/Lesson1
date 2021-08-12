package ru.geekbrains.lesson3;


import java.util.Random;
import java.util.Scanner;

public class MainApp {
    /**
     *Global values
     */
    static int button;
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};


    public static void main(String[] args) {
        MainMenu();
    }

    /**
     * Main menu method
     */
    static void MainMenu() {
        System.out.println("Choose the game: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Guess the number! ");
        System.out.println("2. Guess the word! ");
        int ChooseGameButton = scan.nextInt();
        switch (ChooseGameButton) {
            case 1:
                GuessTheNumber();
                GuessTheNumberMainMenu();
                break;
            case 2:
                GuessTheWord();
                break;
            default:
                System.out.println("Incorrect value");
                break;
        }
    }
    /**
     * Task 1: Guess tha number method
     */
    static void GuessTheNumber() {
        int guessNumber = RandomizeNumber();
        int health = 3;
        System.out.println("Expected number: " + guessNumber);
        System.out.println("Enter the number (3 trials): ");
        Scanner scan = new Scanner(System.in);
        do {
            int userNumber = scan.nextInt();
            if(userNumber == guessNumber) {
                System.out.println("Correct! You won! Congratulations!");
                break;
            } else if(userNumber < guessNumber) {
                health--;
                if(health == 0) {
                    System.out.println("You lose!");
                    break;
                }
                System.out.println("Your number is less than expected. Try again: ");
                System.out.println("You have " + health + " trials");
            } else if(userNumber > guessNumber) {
                health--;
                if(health == 0) {
                    System.out.println("You lose!");
                    break;
                }
                System.out.println("Your number is more than expected. Try again: ");
                System.out.println("You have " + health + " trials");
            }
        } while (health != 0);
    }

    /**
     * Method for randomizing the number for game 1
     */
    static int RandomizeNumber() {
        Random rand = new Random();
        int guessNumber = rand.nextInt(10);
        return guessNumber;
    }

    /**
     * Method for menu for Game 1
     */
    static void GuessTheNumberMainMenu() {
        do {
            System.out.println("Do you want to play again? ");
            System.out.println("0 - No");
            System.out.println("1 - Yes");
            Scanner scan = new Scanner(System.in);
            button = scan.nextInt();

            switch (button) {
                case 0:
                    System.out.println("Thanks for playing");
                    break;
                case 1:
                    GuessTheNumber();
            }
        } while (button != 0);
    }

    /**
     * Task 2: Guess the word
     */
    static void GuessTheWord() {
        int guessWordId = RandomizeIndex();
        System.out.println("Enter the word: ");
        Scanner scan = new Scanner(System.in);
        String userWord = scan.nextLine().toLowerCase();
        char[] correctChars = new char[100];
        do {
            if (userWord.equals(words[guessWordId])) {
                System.out.println("Correct! You won! Congratulations!");
                break;
            } else {
                int count = 0;
                System.out.println("Wrong word!");
                for(int i = 0; i < words[guessWordId].length(); i++) {
                    char guessChars = words[guessWordId].charAt(i);
                    char userChars = userWord.charAt(count);
                    if (guessChars == userChars) {
                        correctChars[i] = userChars;
                        System.out.print(correctChars[i]);
                    } else {
                        if(guessChars == correctChars[i]) {
                            System.out.print(correctChars[i]);
                        } else {
                            System.out.print("*");
                        }
                    }
                    count += 1;
                    if(count == userWord.length()) {
                        break;
                    }
                }

                System.out.println("****************************");
                System.out.println("Try again: ");
                userWord = scan.nextLine().toLowerCase();
            }
        } while(userWord != words[guessWordId]);
    }

    /**
     * Method for randomizing the index for Game 2
     */
    static int RandomizeIndex() {
        Random rand = new Random();
        int Index = rand.nextInt(words.length);
        return Index;
    }
}
