package org.advent.day1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TestElfShould {
    @Test
    void have_zero_total_calories_when_created() {
        Elf elf = new Elf();
        assertThat(elf.getTotalCalories(), equalTo(0));
    }

    @Test
    void have_1000_total_calories_after_adding_1000() {
       Elf elf = new Elf();
       elf.setTotalCalories(1000);
       assertThat(elf.getTotalCalories(), equalTo(1000));
    }

    @Test
    void compare_return_positive_value_for_elf_with_more_total_calories() {
        Elf elfOne = new Elf();
        Elf elfTwo = new Elf();

        elfOne.setTotalCalories(300);
        elfTwo.setTotalCalories(200);

        assertThat(elfOne.compareTo(elfTwo), equalTo(1));
    }

    @Test
    void compare_zero_for_equal_elf() {
        Elf elfOne = new Elf();
        Elf elfTwo = new Elf();

        elfOne.setTotalCalories(300);
        elfTwo.setTotalCalories(300);

        assertThat(elfOne.compareTo(elfTwo), equalTo(0));
    }

    @Test
    void compare_return_negative_value_for_elf_with_less_total_calories() {
        Elf elfOne = new Elf();
        Elf elfTwo = new Elf();

        elfOne.setTotalCalories(100);
        elfTwo.setTotalCalories(200);

        assertThat(elfOne.compareTo(elfTwo), equalTo(-1));
    }
}
