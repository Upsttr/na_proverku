package Homework6;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Task {
    public static void main(String[] args) {
        LocalDate publishDate = LocalDate.now().minusDays(0);
        LocalTime publishTime = LocalTime.now().minusMinutes(60);

        LocalDateTime eventTimestamp = LocalDateTime.of(publishDate, publishTime);

        HRTS humanReadableTimestamp = new HRTS();
        String result = humanReadableTimestamp.getTimestamp(eventTimestamp);
        System.out.println(result);
    }
}
