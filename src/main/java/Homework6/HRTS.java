package Homework6;

import java.time.Duration;
import java.time.LocalDateTime;

public class HRTS implements HumanReadableTimestamp {

    public String getTimestamp(LocalDateTime eventTimestamp) {

        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(eventTimestamp, now);
        long minutes = duration.toMinutes();
        long hours = duration.toHours();
        long days = duration.toDays();

        if (minutes < 60) {
            return formatMinutes(minutes);
        } else if (hours < 24) {
            return formatHours(hours);
        } else if (days == 1) {
            return "Опубликовано вчера";
        } else {
            return formatDays(days);
        }
    }

    private String formatMinutes(long minutes) {
        if (minutes % 10 == 1 && minutes != 11) {
            return "опубликовано " + minutes + " минуту назад";
        } else if (minutes % 10 >= 2 && minutes % 10 <= 4 && (minutes < 10 || minutes > 20)) {
            return "опубликовано " + minutes + " минуты назад";
        } else {
            return "опубликовано " + minutes + " минут назад";
        }
    }

    private String formatHours(long hours) {
        if (hours == 1 || hours == 21) {
            return "Опубликовано " + hours + " час назад";
        } else if (hours % 10 >= 2 && hours % 10 <= 4 && (hours < 10 || hours > 20)) {
            return "Опубликовано " + hours + " часа назад";
        } else {
            return "Опубликовано " + hours + " часов назад";
        }

    }

    private String formatDays(long days) {
        if (days == 1 || days == 21 || days == 31 || days == 101) {
            return "Опубликовано " + days + " день назад";
        } else if (days % 10 >= 2 && days % 10 <= 4 && (days < 10 || days > 20)) {
            return "Опубликовано " + days + " дня назад";
        } else {
            return "Опубликовано " + days + " дней назад";
        }
    }

}

