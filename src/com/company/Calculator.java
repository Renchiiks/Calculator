package com.company;

public class Calculator {
    public static CalculationResult calculate(float x, float y, String op) {
        int result;
        switch (op) {
            case "+":
                return new CalculationResult(x + y, true, "");

            case "-":
                return new CalculationResult(x - y, true, "");
            case "*":
                return new CalculationResult(x * y, true, "");
            case "/":
                if (y == 0f) {
                    return new CalculationResult(0f,false,"Division by zero not allowed");
                }
                return new CalculationResult(x / y, true, "");
            case "%":
                if (y == 0f) {
                    return new CalculationResult(0f,false,"Division by zero not allowed");
                }
                return new CalculationResult(x % y, true, "");

            default:

                return new CalculationResult(0f, true, "There is not such operator");

        }


    }
}
