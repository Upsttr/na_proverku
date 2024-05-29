package org.example;

public class Homework1 {
    public static void main(String[] args) {
        String pet = "cat";
        String s1 = " ";
        String s2 = "Hello, World!";
        String s3 = "   London is the capital of Great Britain     ";
        // Проверяем, является ли строка пустой, то есть имеет ли она длину 0
        boolean result = pet.isEmpty();
        System.out.println(result);
        //  Проверяет, является ли строка пустой или содержит только пробельные символы (пробелы, табуляции и т.д.)
        boolean result1 = s1.isBlank();
        System.out.println(result1);
        // Извлекает подстроку, начиная с указанного начального индекса и заканчивая перед указанным конечным индексом
        String result3 = s2.substring(7, 12);
        System.out.println(result3);
        // Находим индекс первого вхождения указанной подстроки
        int result4 = s2.indexOf("World");
        System.out.println(result4);
        // Находим индекс первого символа последнего вхождения указанной подстроки
        int result5 = s2.lastIndexOf("Hello");
        System.out.println(result5);
        // Приводим все символы к нижнему регистру
        String result6 = s2.toLowerCase();
        System.out.println(result6);
        // Приводим все символы к верхнему регистру
        String result7 = s2.toUpperCase();
        System.out.println(result7);
        // Замена подстроки
        String result8 = s2.replace("Hello", "Hi");
        System.out.println(result8);
        // Проверка, начинается ли строка с префикса
        boolean result9 = s2.startsWith("Hello");
        System.out.println(result9);
        // Проверка, заканчивается ли строка на суффикс
        boolean result10 = s2.endsWith("World!");
        System.out.println(result10);
        // Повторение строки
        String result11 = pet.repeat(3);
        System.out.println(result11);
        // Проверка наличия подстроки в строке
        boolean result12 = s2.contains("!");
        System.out.println(result12);
        // Соединение строк
        String result13 = s2.concat(pet);
        System.out.println(result13);
        // Удаляем пробелы в начале и конце строки
        String result14 = s3.trim();
        System.out.println(result14);
        // Сравнение содержимого строк
        boolean result15 = s2.equals(s3);
        System.out.println(result15);

    }
}
