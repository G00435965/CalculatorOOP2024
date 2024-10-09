package atu.ie;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Please enter the base number: "); //Enter base number
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Please enter the exponent: "); //Enter exponent
        int exponent = sc.nextInt();

        calculateExponential(base, exponent); //Directly calling th method to calculate exponent

    }

    public static void calculateExponential(int base, int exponent) {
        double result = Math.pow(base, exponent); //Using Math.pow to calculate exponential
        System.out.println("The result is: " + result);
    }
    }
