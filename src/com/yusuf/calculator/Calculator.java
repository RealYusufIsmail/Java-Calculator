package com.yusuf.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
	// write your code here
        int num1 =0;
        int num2 =0;
        char operator;
        double answer = 0.0;

        Scanner scanMath = new Scanner(System.in);

        System.out.println("Please enter your first value");
        num1 = scanMath.nextInt();
        System.out.println("Please enter your second value");
        num2 = scanMath.nextInt();
        System.out.println("What is your mathematical operation");

        operator = scanMath.next().charAt(0);

        switch (operator) {
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1/num2;
                break;
        }
        System.out.println(num1+" "+operator+" "+num2+" = "+answer);
    }
}
