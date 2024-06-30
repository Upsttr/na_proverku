package Attestation1;

import java.util.Arrays;

public class Task3Array {
    public static void main(String[] args) {
        int[] array = new int[]{50, 399, 33, 119, 155};

        // Сортируем массив по возрастанию. Выводим предпоследний элемент.
        Arrays.sort(array);
        System.out.println(array[array.length - 2]);
    }
}
