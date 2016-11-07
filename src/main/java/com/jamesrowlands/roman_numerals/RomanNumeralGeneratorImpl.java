package com.jamesrowlands.roman_numerals;

/**
 * Created by James on 31/10/2016.
 */
public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator {

    public static final int[] KEY_VALUES = {1000,900,500,450,400,100,90,50,40,10,9,5,4,1};
    public static final String[] ROMAN_SYMBOLS = {"M", "CM", "D", "LD", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static final int MIN_VALUE_TO_CONVERT = 1;
    public static final int MAX_VALUE_TO_CONVERT = 3999;

    public String generateNumeral(int number) {

        if(number < MIN_VALUE_TO_CONVERT || number > MAX_VALUE_TO_CONVERT)
            return "Number to convert must be between " + MIN_VALUE_TO_CONVERT + " and " + MAX_VALUE_TO_CONVERT;

        StringBuilder romanNumeralString = new StringBuilder();

        int remainingValue = number;

        for(int i = 0; i < KEY_VALUES.length; i++) {
            remainingValue = convertToNumeral(remainingValue, KEY_VALUES[i], ROMAN_SYMBOLS[i], romanNumeralString);
        }

        return romanNumeralString.toString();
    }

    private int convertToNumeral(int remainingValue, int number, String romanNummeral, StringBuilder romanNumeralString) {
        while(remainingValue >= number) {
            romanNumeralString.append(romanNummeral);
            remainingValue -= number;
        }
        return remainingValue;
    }
}
