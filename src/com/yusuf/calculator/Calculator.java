package com.yusuf.calculator;

import java.util.Scanner;

@SuppressWarnings("all")
public class Calculator {

    public static void main(String[] args) {
	// write your code here
        int num1 =0;
        int num2 =0;
        char math;
        double answer = 0.0;

        Scanner scanMath = new Scanner(System.in);

        System.out.println("Please enter your first value");
        num1 = scanMath.nextInt();
        System.out.println("Please enter your second value");
        num2 = scanMath.nextInt();
        System.out.println("What is your mathematical operation");

        math = scanMath.next().charAt(0);

        switch (math) {
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1/num2;
                break;
        }
        System.out.println(num1+" "+math+" "+num2+" = "+answer);
    }
}
