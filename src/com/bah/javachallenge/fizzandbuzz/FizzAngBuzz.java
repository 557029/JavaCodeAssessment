package com.bah.javachallenge.fizzandbuzz;

public class FizzAngBuzz {
    private static final int FIZZ_NUM = 6;
    private static final int BUZZ_NUM = 10;
    private static final int MAX_NUM = 500;

    // Getting Fizz value
    private static boolean fizz(int param) {
        return param % FIZZ_NUM == 0;
    }

    private static boolean buzz(int param) {
        return param % BUZZ_NUM == 0;
    }

    // Solution 1
    private static void fizzAndBuzz1(int maxNum) {
        for(int i = 1; i <= maxNum; i++) {
            if(i % FIZZ_NUM == 0 && i % BUZZ_NUM == 0) {
                System.out.println("FizzBuzz");
            } else if(i % FIZZ_NUM == 0) {
                System.out.println("Fizz");
            } else if(i % BUZZ_NUM == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    // Solution 2
    //
    //
    private static void fizzAndBuzz2(int maxNum) {
        // Let's start counting from 1 instead of 0 ;)
        //
        for(int i = 1; i <= maxNum; i++) {
            String str = (fizz(i) && buzz(i)) ? "FizzBuzz" : "" + i;
            str = (fizz(i)) ? "Fizz" : "" + str;
            str = (buzz(i)) ? "Buzz" : "" + str;
           System.out.println(String.format("%s", str));
        }
    }

    private static void fizzAndBuzz() {
        fizzAndBuzz1(MAX_NUM);
    }

    public static void main(String[] args ) {
        fizzAndBuzz();
    }

}
