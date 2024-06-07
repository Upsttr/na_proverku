package Homework4;

public class Task2_3 {
    public static void main(String[] args) {

        // Задание 2 и 3

        int x = 10;

        if (x % 4 == 0) {
            System.out.println("Четное число. Кратно четырем");
        } else if (x % 2 == 0) {
            System.out.println("Четное число");
        } else if (x % 2 != 0 && x % 3 == 0) {
            System.out.println("Нечетное число. Кратно трем");
        } else {
            System.out.println("Нечетное число");
        }
    }
}
