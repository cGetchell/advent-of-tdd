package org.advent.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

import org.apache.commons.lang3.StringUtils;

public class Callibrator {

    public static List<Integer> numberArray = new ArrayList<>();
    private static String[] wordNumbers = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    private static String[] numericNumbers = { "o1e", "t2o", "t3", "4", "5e", "6", "7n", "e8t", "n9e" };

    public static int digitExtractor(String sequence) {

        List<String> numberStrings = new ArrayList<>();

        String editedString = changeWordToNumber(sequence);

        for (Character c : editedString.toCharArray()) {
            if (Character.isDigit(c)) {
                numberStrings.add(c.toString());
            }
        }

        int length = numberStrings.size();
        String doubleDigitString = "0";

        if (length >= 1) {
            doubleDigitString = numberStrings.get(0) + numberStrings.get(length - 1);
        }

        int doubleDigit = Integer.parseInt(doubleDigitString);

        numberArray.add(doubleDigit);

        return doubleDigit;
    }

    private static String changeWordToNumber(String s){
       return StringUtils.replaceEachRepeatedly(s, wordNumbers, numericNumbers);
    }

    public static int callibrationSum(List<Integer> numbers) {
        int total = 0;

        for (Integer i : numbers) {
            total += i;
        }

        return total;
    }

    public static void reader(String fileName) {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(fileName);
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);

        try {
            for (String line; (line = reader.readLine()) != null;) {
                digitExtractor(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
