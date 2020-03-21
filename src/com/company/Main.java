package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter number 1: ");
            var x = sc.nextFloat();
            System.out.print("Please enter number 2: ");
            var y = sc.nextFloat();
            System.out.println("Enter operator(+,-,*,/,%)");
            var op = sc.next();

            var result = Calculator.calculate(x, y, op);
            if (result.isSuccess()) {
                System.out.println(result.getResult());
            } else {
                System.out.println(result.getErrorMessage());
                continue;
            }
            System.out.println("Do you want to continue? (Yes/No)");
            var cont = sc.next();

            if (cont.toUpperCase().equals("YES")) {
                continue;
            }


        }

    }
}
