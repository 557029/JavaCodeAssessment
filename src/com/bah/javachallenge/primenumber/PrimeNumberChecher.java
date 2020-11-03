package com.bah.javachallenge.primenumber;

public class PrimeNumberChecher {
    public static void main(String[] args) {
        final PrimeNumber impl1 = new PrimeNumberImpl1();
        final PrimeNumber impl2 = new PrimeNumberImpl2();

        for(int i = 1; i <= 100; i++) {
            //System.out.println(i + " - " + impl1.isPrime(i) + ", " + impl1.isPrime(i));
            //System.out.println(i + " - " + impl1.isPrime(i) + ", " + impl2.isPrime(i));
            System.out.println(String.format("isPrime(%d) = %s",i, impl1.isPrime(i)));
        }
    }
}
