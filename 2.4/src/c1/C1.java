package c1;

import java.util.Scanner;

public class C1 {
    private int number1;
    private int number2;

    public void readNumbersFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Input first number: ");
            number1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Input second number: ");
            number2 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    public int getSum() {
        return number1 + number2;
    }
}