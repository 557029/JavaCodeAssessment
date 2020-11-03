package com.bah.javachallenge.reverser;

// StringBuffer case
public class Reverse2Impl implements Reverser {
    @Override
    public boolean isReverse(String string1, String string2) {
        // Prevent different strings lengths.
        if(string1.length() != string2.length()) {
            return false;
        }
        final String str = new StringBuffer(string1).reverse().toString();
        return string2.equals(str);
    }

}
