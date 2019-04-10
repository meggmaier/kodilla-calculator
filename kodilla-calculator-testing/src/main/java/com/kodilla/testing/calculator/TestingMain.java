package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int total = calculator.add(2,3);

        if (total == 5){
            System.out.println("It's working!");
        } else {
            System.out.println("ERROR");
        }


        int difference = calculator.subtract(5,4);

        if (difference == 1){
            System.out.println("It's working!");
        } else {
            System.out.println("ERROR");
        }
    }
}
