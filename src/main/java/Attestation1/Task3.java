package Attestation1;

public class Task3 {
    public static void main(String[] args) {

        int[] array = new int[]{50, 99, 33, 11, 155};

        // Сначала попробовал алгоритмический подход. Потом попробовал сортировку и вышло всего 2 строки см. Task3Array
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;


        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];

            } else if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i];
            }
        }
        System.out.println(secondMax);


    }
}
