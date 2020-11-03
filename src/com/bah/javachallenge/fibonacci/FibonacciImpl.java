package com.bah.javachallenge.fibonacci;
public class FibonacciImpl implements Fibonacci {
    @Override
    public int getFibonacci(int n) {
        // Exclude 0 and 1 entry numbers
        if (n == 0) {
            return 0;
        }
        if (n < 2) {
            return 1;
        }

        int firstNum = 0;
        int secondNum = 1;
        int sumNums = 1;

        for (int i = 2; i <= n; ++i) {
            sumNums = firstNum + secondNum;
            firstNum =  secondNum;
            secondNum = sumNums;
        }
        return sumNums;
    }

    // * 0, 1, 1, 2, 3, 5, 8, 13 ...
    public static void main(String[] args) {
        final Fibonacci fibonacci = new FibonacciImpl();
        for(int i = 1; i <= 10; i++) {
            //System.out.println("getFibonacci(\"" + i + "\") = " + fibonacci.getFibonacci(i));
            System.out.println(String.format("getFibonacci(\"%d\") = %d",
                    i,
                    fibonacci.getFibonacci(i)));
        }

    }
}
