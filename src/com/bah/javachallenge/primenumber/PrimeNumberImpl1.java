package com.bah.javachallenge.primenumber;

public class PrimeNumberImpl1 implements PrimeNumber {
    @Override
    public boolean isPrime(int number) {
        // This number is not divisible more than half, we can consider to use only half number selection
        //
        for(int i = 2; i <= number/2 ; ++i) {
            if(number % i == 0) {
                return true;
            }
        }
        return false;
    }
}
