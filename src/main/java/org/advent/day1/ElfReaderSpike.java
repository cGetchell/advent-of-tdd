package org.advent.day1;

import java.io.*;
import java.util.*;

public class ElfReaderSpike {

    static List<Elf> elves = new ArrayList<>();

    public static void readFile(String filename) {
        try {
            File calories = new File(filename);
            Scanner myReader = new Scanner(calories);
            Elf elf = new Elf();
            while (myReader.hasNextLine()) {
                String nextLine = myReader.nextLine();
                if (!nextLine.isBlank()) {
                    int value = Integer.parseInt(nextLine);
                    elf.addCalories(value);
                } else {
                    elves.add(elf);
                    elf = new Elf(); 
                }
            }
            elves.add(elf);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
        
    }
