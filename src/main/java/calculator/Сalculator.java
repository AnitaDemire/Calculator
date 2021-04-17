package calculator;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        Scanner ann = new Scanner(System.in);
        System.out.println("=== Hello! I'm a calculator! ===");
        System.out.println("Enter an Operation:");
        String in = ann.next();
        char oper = in.charAt(0);

        System.out.print("Enter a number: ");
        in = ann.next();
        double num1 = Double.parseDouble(in);

        System.out.print("Enter another number: ");
        in = ann.next();
        double num2 = Double.parseDouble(in);


        if (oper == '+') {
            double result = num1 + num2;
            System.out.println("Your result:" + result);
        } else if (oper == '-') {
            double result = num1 - num2;
            System.out.println("Your result:" + result);
        } else if (oper == '*') {
            double result = num1 * num2;
            System.out.println("Your result:" + result);
        } else if (oper == '/') {
            double result = num1 / num2;
            System.out.println("Your result:" + result);
        } else {
            System.out.println("Sorry, the operation is incorrect");
        }
        System.out.println("=== Have a nice day! Catch kisses!:) ===");
    }
}