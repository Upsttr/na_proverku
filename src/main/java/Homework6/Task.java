package Homework6;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Task {
    public static void main(String[] args) {
        LocalDate publishDate = LocalDate.now().minusDays(0);
        // Если в использую часы, то когда в днях значение 0 , а в часах 20+, то все ломается и в выводе отображается отрицательное значение
        //  LocalTime publishTime = LocalTime.now().minusHours(22);
        LocalTime publishTime = LocalTime.now().minusMinutes(125);
        LocalDateTime eventTimestamp = LocalDateTime.of(publishDate, publishTime);

        HRTS humanReadableTimestamp = new HRTS();
        String result = humanReadableTimestamp.getTimestamp(eventTimestamp);
        System.out.println(result);
    }
}