package dev.factoria;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DaysOfTheWeekTest {

    DaysOfTheWeek daysOfTheWeek;

    @BeforeEach
    void initializeClass() {
        daysOfTheWeek = new DaysOfTheWeek();
    }

    @Test
    void testFillTheList() {

        List<String> expected = new ArrayList<>(
                Arrays.asList(
                        "Monday", "Tuesday", "Wednesday",
                        "Thursday", "Friday", "Saturday", "Sunday"));

        daysOfTheWeek.fillTheList();

        assertThat(daysOfTheWeek.list, is(equalTo(expected)));
    }
}
