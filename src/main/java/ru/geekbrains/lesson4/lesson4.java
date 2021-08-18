package ru.geekbrains.lesson4;

import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class lesson4 {
    /**
     * Global values
     */
    public static char[][] Map;
    public static final int Map_size = 3;

    public static final char Empty_Dot = '*';
    public static final char Dot_X = 'X';
    public static final char Dot_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    /**
     * Entry Point
     */
    public static void main(String[] args) {
        Initialize_Map();
        Print_Map();
        Game_Process();
    }

    /**
     * Game processing method
     */
    public static void Game_Process() {
        while (true) {
            PlayerTurn();
            Print_Map();
            if (checkWin(Dot_X)) {
                System.out.println("You won! ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw! ");
                break;
            }
            AiTurn();
            Print_Map();
            if (checkWin(Dot_O)) {
                System.out.println("AI won! ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw! ");
                break;
            }
        }
    }

    /**
     * Initializing game field method
     */
    public static void Initialize_Map() {
        Map = new char[Map_size][Map_size];
        for (int i = 0; i < Map_size; i++) {
            for (int j = 0; j < Map_size; j++) {
                Map[i][j] = Empty_Dot;
            }
        }
    }

    /**
     * Printing game field method
     */
    public static void Print_Map() {
        for (int i = 0; i <= Map_size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < Map_size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < Map_size; j++) {
                System.out.print(Map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Checking free frames of field method
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= Map_size || y < 0 || y >= Map_size) return false;
        if (Map[y][x] == Empty_Dot) return true;
        return false;
    }

    /**
     * Player step method
     */
    public static void PlayerTurn() {
        int x, y;
        do {
            System.out.println("Enter coordinates in X Y format: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        Map[y][x] = Dot_X;
    }

    /**
     * Ai step method
     */
    public static void AiTurn() {
        int x, y;
        do {
            x = rand.nextInt(Map_size);
            y = rand.nextInt(Map_size);
        } while(!isCellValid(x, y));
        System.out.println("AI goes to: " + (x + 1) + " " + (y + 1));
        Map[y][x] = Dot_O;
    }

    /**
     * Method for checking the Win event
     */
    public static boolean checkWin(char symbol) {
        int count_Diagonal = 0;
        int count_Reverse_Diagonal = 0;
        int count_Vertical = 0;
        int count_Horizontal = 0;
        for (int i = 0; i < Map_size; i++) {
            if(Map[i][i] == symbol) {
                count_Diagonal++;
                if(count_Diagonal == Map_size) {
                    return true;
                }
            }
            if(Map[i][Map_size-1-i] == symbol) {
                count_Reverse_Diagonal++;
                if(count_Reverse_Diagonal == Map_size) {
                    return true;
                }
            }
            for (int j = 0; j < Map_size; j++) {
                if(Map[i][j] == symbol) {
                    count_Horizontal++;
                    if(count_Horizontal == Map_size) {
                        return  true;
                    }
                } else {
                    count_Horizontal = 0;
                }

                if(Map[j][i] == symbol) {
                    count_Vertical++;
                    if(count_Vertical == Map_size) {
                        return  true;
                    }
                } else {
                    count_Vertical = 0;
                }
            }

        }
        return false;
    }

    /**
     * Field fullness checking method
     */
    public static boolean isMapFull() {
        for (int i = 0; i < Map_size; i++) {
            for (int j = 0; j < Map_size; j++) {
                if (Map[i][j] == Empty_Dot) return false;
            }
        }
        return true;
    }

}
