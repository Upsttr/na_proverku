package Attestation1;

import java.time.LocalDate;
import java.time.Month;

public class CactusWatering {

    private static final int WINTER_WATERING_INTERVAL_DAYS = 30;
    private static final int SPRING_AUTUMN_WATERING_INTERVAL_DAYS = 7;
    private static final int SUMMER_WATERING_MIN_INTERVAL_DAYS = 2;
    private static final int HUMIDITY_THRESHOLD = 30;
    private Sensor sensor;

    public CactusWatering() {
        this.sensor = new Sensor();
    }

    public String calculateNextWateringDate(LocalDate lastWateringDate) {
        Month currentMonth = lastWateringDate.getMonth();

        if (currentMonth == Month.DECEMBER || currentMonth == Month.JANUARY || currentMonth == Month.FEBRUARY) {
            // Зима: поливаем раз в месяц
            return lastWateringDate.plusDays(WINTER_WATERING_INTERVAL_DAYS).toString();
        } else if (currentMonth == Month.MARCH || currentMonth == Month.APRIL || currentMonth == Month.MAY ||
                currentMonth == Month.SEPTEMBER || currentMonth == Month.OCTOBER || currentMonth == Month.NOVEMBER) {
            // Весна или осень: поливаем раз в неделю
            return lastWateringDate.plusDays(SPRING_AUTUMN_WATERING_INTERVAL_DAYS).toString();
        } else if (currentMonth == Month.JUNE || currentMonth == Month.JULY || currentMonth == Month.AUGUST) {
            // Лето: поливаем в зависимости от влажности
            int humidity = sensor.getHumidity();
            System.out.println("Текущая влажность: " + humidity + "%");
            if (humidity < HUMIDITY_THRESHOLD) {
                // Если влажность менее 30%, проверяем, прошло ли больше одного дня с последнего полива
                if (LocalDate.now().isAfter(lastWateringDate.plusDays(1))) {
                    return LocalDate.now().toString();
                } else {
                    return lastWateringDate.plusDays(SUMMER_WATERING_MIN_INTERVAL_DAYS).toString();
                }
            } else {
                return "Полив не требуется";
            }
        }

        return lastWateringDate.plusDays(1).toString();
    }
}

