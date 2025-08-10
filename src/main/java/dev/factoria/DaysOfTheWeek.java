package dev.factoria;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Клас повинен мати такі методи:
 *
 * [X] Метод створення списку днів тижня
 * [X] Метод, який повертає дні тижня
 * [X] Метод, який повертає довжину списку
 * [X] Метод виключення одного дня тижня
 * [ ] Метод, який повертає запитуваний день тижня
 * [ ] Метод, який повертає інформацію про те, чи існує запитуваний день у списку
 * [ ] Метод сортування списку днів в алфавітному порядку
 * [ ] Метод очищення списку
 *
 * Вимоги:
 *
 *    Для кожного методу необхідно виконати модульне тестування
 *    Необхідно використовувати колекцію "List" з java.util
 * 
 * TO-DO

 * [X] Змінити реалізацію функції fillTheList()
 * 
 */

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
}
