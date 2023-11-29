package org.advent.day1;

/**
 * Elf that is assigned calories
 */
public class Elf implements Comparable<Elf> {

    private int totalCalories = 0;

    /**
     * Calories carried by the Elf
     * @return total calories
     */
    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int newTotal){
        totalCalories = newTotal;
    }

    @Override
    public int compareTo(Elf arg0) {
        if (getTotalCalories() < arg0.getTotalCalories()) {
            return -1;
        } else if (getTotalCalories() > arg0.getTotalCalories()) {
            return 1;
        } 
        return 0;
    }

}
