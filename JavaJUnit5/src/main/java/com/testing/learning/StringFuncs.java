package com.testing.learning;

public class StringFuncs {
    public String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int startChar = 0;
        int lastChar = charArray.length - 1;

        while (startChar < lastChar) {
            char tmpChar = charArray[lastChar];
            charArray[lastChar] = charArray[startChar];
            charArray[startChar] = tmpChar;
            startChar++;
            lastChar--;
        }
        return String.valueOf(charArray);
    }
}
