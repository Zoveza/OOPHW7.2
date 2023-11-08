package View;

import java.util.Scanner;


public class CalculatorInput {
    private static Scanner scanner = new Scanner(System.in);

    public double getRealInput(String number) {
        System.out.print("Введите действительное число " + number + " комплексного числа: ");
        return scanner.nextDouble();
    }

    public double getImaginaryInput(String number) {
        System.out.print("Введите мнимую единицу " + number + " комплексного числа: ");
        return scanner.nextDouble();
    }

    public void displayResult(String result) {
        System.out.println("В результате получается: " + result);
    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }


    public static int getChoice() {
        System.out.print("Выберите операцию" + "\n" +
                "  1  -> для сложения чисел; " + "\n" +
                "  2  -> для вычитания чисел; " + "\n" +
                "  3  -> для умножения чисел; " + "\n" +
                "  4  -> для деления чисел; " + "\n" + " Введите число:  ");
        return scanner.nextInt();
    }
}