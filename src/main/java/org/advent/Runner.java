package org.advent;

import org.advent.day1.Callibrator;

public class Runner {
    public static void main(String[] args) {
        Callibrator.reader("callibrator.txt");
        int total = Callibrator.callibrationSum(Callibrator.numberArray);
        System.out.println(total);
    }
    
}
