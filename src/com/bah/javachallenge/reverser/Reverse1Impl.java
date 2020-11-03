package com.bah.javachallenge.reverser;

// ArrayCase
public class Reverse1Impl implements Reverser {
    @Override
    public boolean isReverse(String string1, String string2) {
        // Prevent different strings lengths.
        if(string1.length() != string2.length()) {
            return false;
        }

        final char[] arrChars = string1.toCharArray();
        final char[] compareChars = new char[arrChars.length];

        for(int i = 0; i < arrChars.length; i++) {
            compareChars[(arrChars.length - 1) - i] = arrChars[i];
        }
        final String str = new String(compareChars);
        return str.equals(string2);
    }


    public static void main(String[] args) {
        final Reverser reverser = new Reverse1Impl();
        System.out.println(reverser.isReverse("abc","cba"));
        System.out.println(reverser.isReverse("abcd","dcba"));
        System.out.println(reverser.isReverse("abcdf","gdcba"));
    }
}
