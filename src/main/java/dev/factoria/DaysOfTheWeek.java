package dev.factoria;

import java.util.List;
import java.util.ArrayList;

/*
 * Клас повинен мати такі методи:
 *
 *    Метод створення списку днів тижня
 *    Метод, який повертає дні тижня
 *    Метод, який повертає довжину списку
 *    Метод виключення одного дня тижня
 *    Метод, який повертає запитуваний день тижня
 *    Метод, який повертає інформацію про те, чи існує запитуваний день у списку
 *    Метод сортування списку днів в алфавітному порядку
 *    Метод очищення списку
 *
 * Вимоги:
 *
 *    Для кожного методу необхідно виконати модульне тестування
 *    Необхідно використовувати колекцію "List" з java.util
 */

public class DaysOfTheWeek {

    List<String> list = new ArrayList<>();

    public void fillTheList() {

        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        list.clear();
        for (int i = 0; i < days.length; i++) {
            list.add(days[i]);
        }
    }
}
