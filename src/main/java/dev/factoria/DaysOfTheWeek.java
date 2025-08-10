package dev.factoria;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class DaysOfTheWeek {

    List<String> daysList = new ArrayList<>();

    public void fillTheList() {

        daysList.clear();
        daysList.addAll(Arrays.asList(
                "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"));
    }

    public List<String> returnActualDaysList() {
        return daysList;
    }

    public Integer returnActualDaysListLength() {
        return daysList.size();
    }

    public void removeOneDayFromTheDaysList(String day) {
        daysList.remove(day);
    }

    public String returnTheDayFromDaysListByIndex(int index) {
        return daysList.get(index);
    }

    public boolean returnIsTheDayIncludeInDaysList(String day) {
        return daysList.contains(day);
    }

    public void sortTheDaysList() {
        daysList.sort(Comparator.naturalOrder());
    }

    public void clearTheDaysList() {
        daysList.clear();
    }
}
