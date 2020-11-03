package com.bah.javachallenge.primenumber;

public class PrimeNumberImpl2 implements PrimeNumber {
    @Override
    public boolean isPrime(int number) {
        int index = 2;
        while(index <= (number/2)) {
            if(number % index == 0) {
                return false;
            }
            ++index;
        }
        return true;
    }
}
