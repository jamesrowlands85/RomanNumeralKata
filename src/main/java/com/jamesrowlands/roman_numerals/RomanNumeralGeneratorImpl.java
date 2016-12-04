package com.jamesrowlands.roman_numerals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by James on 31/10/2016.
 */
public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator {

    private static final int[] ROAMAN_NUMERAL_VALUES = {1000,900,500,450,400,100,90,50,40,10,9,5,4,1};
    private static final String[] ROMAN_SYMBOLS = {"M", "CM", "D", "LD", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int MIN_VALUE_TO_CONVERT = 1;
    private static final int MAX_VALUE_TO_CONVERT = 3999;
    private static List<String> NUMERALS_LIST = new ArrayList<String>(Arrays.asList(ROMAN_SYMBOLS));


    public String generateNumeral(int number) {

        if(number < MIN_VALUE_TO_CONVERT || number > MAX_VALUE_TO_CONVERT)
            return "Number to convert must be between " + MIN_VALUE_TO_CONVERT + " and " + MAX_VALUE_TO_CONVERT;

        StringBuilder romanNumeralString = new StringBuilder();

        int remainingValue = number;

        for(int i = 0; i < ROAMAN_NUMERAL_VALUES.length; i++) {
            remainingValue = convertToNumeral(remainingValue, ROAMAN_NUMERAL_VALUES[i], ROMAN_SYMBOLS[i], romanNumeralString);
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

    public int convertNumeralToNumber(String numeral) {
        int number = 0;
        int previous = 0;
        int current;

        for(int i = 0; i < numeral.length(); i++) {

            int index = NUMERALS_LIST.indexOf(String.valueOf(numeral.charAt(i)));
            current = ROAMAN_NUMERAL_VALUES[index];

            if(previous < current && previous != 0) {
                current = current - previous;
                number-=previous;
            }

            number+=current;
            previous = current;
        }

        return number;
    }
}
