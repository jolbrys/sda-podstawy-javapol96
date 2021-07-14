package dataczas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Zadanie1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_TIME;

        System.out.println(dateFormatter.format(localDateTime));
        System.out.println(dateFormatter.format(localDateTime));
        System.out.println(timeFormatter.format(localDateTime));
    }
}
