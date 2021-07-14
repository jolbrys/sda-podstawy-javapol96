package dataczas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class PrzykladFormattery {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;
        System.out.println("Std date formatter: " + dateFormatter.format(now));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("Std date time formatter: " + dateTimeFormatter.format(now));

        DateTimeFormatter custom = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("Custom formatter: " + custom.format(now));

        DateTimeFormatter longStyle = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("Full style date time formatter: " + longStyle.format(now));
        DateTimeFormatter shortStyle = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Short style date time formatter: " + shortStyle.format(now) );

        System.out.println("formatted & parsed: " + shortStyle.parse(shortStyle.format(now)));
    }
}
