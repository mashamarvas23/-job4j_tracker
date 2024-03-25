package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public double divide(int y) {
        return (double) y / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public double sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        int result1 = Calculator.sum(10);
        System.out.println(result1);
        Calculator calculator = new Calculator();
        int result2 = calculator.multiply(5);
        System.out.println(result2);
        int result3 = Calculator.minus(9);
        System.out.println(result3);
        double result4 = calculator.divide(26);
        System.out.println(result4);
        double result5 = calculator.sumAllOperation(18);
        System.out.println(result5);
    }
}
