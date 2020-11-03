package com.bah.javachallenge.primenumber;

public class PrimeNumberImpl1 implements PrimeNumber {
    @Override
    public boolean isPrime(int number) {
        // 0, 1 and 2 are known prime numbers
        if (number <= 2) {
            return true;
        }
        // Divide the number by half for check if it is divisible
        for(int i = 2; i <= number/2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
