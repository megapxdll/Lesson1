package ru.geekbrains.lesson9;

public class MainApp {
    /**
     * Global values
     */
    public static int sum = 0;

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] strings = new String[4][4];

        // This loop for generate String numbers. For testing our checker

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = String.valueOf(1);
                System.out.print(strings[i][j] + " ");
            }
        }
        strings[3][2] = "%";

        String_To_Int_Checker(strings);

    }

    public static void String_To_Int_Checker (String[][] strings) throws MyArraySizeException, MyArrayDataException{
        String checker = "";
        if (strings.length == 4 && strings[0].length == 4) {
            try {
                for (int i = 0; i < strings.length; i++) {
                    for (int j = 0; j < strings[i].length; j++) {
                        checker = "[" + i + "]" + "[" + j + "]" ;
                        System.out.println(sum += Integer.parseInt(strings[i][j]));
                    }
                }
            } catch (NumberFormatException ex) {
                throw new MyArrayDataException("Data is not numerical format at strings" + checker, ex);
            }
        } else {
            throw new MyArraySizeException("Array size not as [4][4] format");
        }
    }
}
