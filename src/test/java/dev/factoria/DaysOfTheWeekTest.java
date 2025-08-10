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
        daysOfTheWeek.fillTheList();
    }

    @Test
    void testFillTheList() {

        List<String> expected = new ArrayList<>(
                Arrays.asList(
                        "Monday", "Tuesday", "Wednesday",
                        "Thursday", "Friday", "Saturday", "Sunday"));

        daysOfTheWeek.fillTheList();

        assertThat(daysOfTheWeek.daysList, is(equalTo(expected)));
    }

    @Test
    void testReturnActualDaysList() {

        List<String> expected = new ArrayList<>(
                Arrays.asList(
                        "Monday", "Tuesday", "Wednesday",
                        "Thursday", "Friday", "Saturday", "Sunday"));

        List<String> result = daysOfTheWeek.returnActualDaysList();

        assertThat(result, is(equalTo(expected)));
    }

    @Test
    void testReturnActualDaysListLength() {

        int expected = 7;

        int result = daysOfTheWeek.returnActualDaysListLength();

        assertThat(result, is(equalTo(expected)));
    }

    @Test
    void testRemoveOneDayFromTheDaysList() {

        List<String> expected = new ArrayList<>(
                Arrays.asList(
                        "Tuesday", "Wednesday",
                        "Thursday", "Friday", "Saturday", "Sunday"));

        daysOfTheWeek.removeOneDayFromTheDaysList("Monday");

        assertThat(daysOfTheWeek.daysList, is(equalTo(expected)));
    }

    @Test
    void testReturnTheDayFromDayListByIndex() {

        int index = 0;

        String expected = "Monday";

        String result = daysOfTheWeek.returnTheDayFromDaysListByIndex(index);

        assertThat(result, is(equalTo(expected)));
    }

    @Test
    void testIsTheDayIncludeInDaysList() {

        String dayForChecking = "Monday";

        boolean expected = true;

        boolean result = daysOfTheWeek.returnIsTheDayIncludeInDaysList(dayForChecking);

        assertThat(result, is(equalTo(expected)));
    }

    @Test
    void testSortTheDaysList() {

        List<String> expected = new ArrayList<>(
                Arrays.asList(
                        "Friday", "Monday", "Saturday",
                        "Sunday", "Thursday", "Tuesday", "Wednesday"));

        daysOfTheWeek.sortTheDaysList();

        assertThat(daysOfTheWeek.daysList, is(equalTo(expected)));
    }

    @Test
    void testClearTheDayList() {

        List<String> expected = new ArrayList<>();

        daysOfTheWeek.clearTheDaysList();

        assertThat(daysOfTheWeek.daysList, is(equalTo(expected)));
    }
}
