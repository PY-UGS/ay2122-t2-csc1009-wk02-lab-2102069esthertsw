package com.esther.lab.wk02;

import java.util.Scanner;

public class Q2Average {
    Scanner userInput = new Scanner(System.in);
    double number1 = userInput.nextDouble();
    double number2 = userInput.nextDouble();
    double number3 = userInput.nextDouble();

    double getAverage() {
        return (number1 + number2 + number3) / 3;   //IMPROVEMENT: allow user to input n size, use for loop
    }

    public static void main(String[] args)
    {
        System.out.println("Enter 3 numbers: ");
        Q2Average avg = new Q2Average();
        System.out.println("The average of " + avg.number1 + ", " + avg.number2 + " and " + avg.number3 +" is "
                + avg.getAverage());
    }
}
