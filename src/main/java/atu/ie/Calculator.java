package atu.ie;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Please enter the first number: "); //Enter first number
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter the second number: "); //Enter first number
        int b = sc.nextInt();
        System.out.println("Please enter an operation: "); //Enter first number
        String op = sc.next();
        switch (op) {
            case "subtract": subtract(a, b); break;
            default: System.out.println("Invalid operation"); break;
        }
    }

    public static void subtract(int a, int b)
    {
        int sum = a - b;
        System.out.println("The difference is: " + sum);

    }
}
