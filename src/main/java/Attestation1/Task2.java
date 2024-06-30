package Attestation1;

import java.time.LocalDate;


public class Task2 {

    public static void main(String[] args) {

        CactusWatering cactusWatering = new CactusWatering();

        // Задаем дату последнего полива
        LocalDate lastWateringDate = LocalDate.of(2024, 06, 27);


        String nextWateringDate = cactusWatering.calculateNextWateringDate(lastWateringDate);


        System.out.println("Следующая дата полива кактуса: " + nextWateringDate);
    }
}