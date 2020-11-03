package com.bah.javachallenge.reverser;

public class ReverseChecker {

    public static void main(String[] args) {
        final Reverser reverser1 = new Reverse1Impl();
        final Reverser reverser2 = new Reverse2Impl();

        final String[][] arrForTest = new String[][]{
                {"abc","cba"},
                {"das ist auto","otua tsi sad"},
                {"qwe","ewrert"},
                {"asdfg","gfdsa"}
        };
        for(int i = 0; i < arrForTest.length; i++) {
            String[] strKeys = arrForTest[i];
            System.out.println(reverser1.isReverse(strKeys[0], strKeys[1])
                    + " "
                    + reverser2.isReverse(strKeys[0], strKeys[1]));
        }
    }
}
