package com.kodilla;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("My simple calculator\n");
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.print("Enter the first and the second number: ");

        int a = scanner.nextInt(); //assign the numbers
        int b = scanner.nextInt(); // to respective variable
        System.out.println("What operation u want to perform?" + " Please choose '+' or '-'");
        String operation;
        operation = scanner.next();
        scanner.close();
        switch (operation) {
            case "+":
                result = a + b;
                System.out.print("Sum of the two inputs = ");
                System.out.print(result);
                break;
            case "-":
                result = a - b;
                System.out.print("Subtraction of the two inputs = ");
                System.out.print(result);
                break;
        }
    }
}
