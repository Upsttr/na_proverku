package Homework5;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> tasks = new ArrayList<>();

        tasks.add("Подъем");
        tasks.add("Завтрак");
        tasks.add("Зарядка");
        tasks.add("Душ");
        tasks.add("Работа");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Задача " + (i + 1) + ": " + tasks.get(i));
        }
    }
}
