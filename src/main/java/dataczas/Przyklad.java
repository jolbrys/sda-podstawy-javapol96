package dataczas;

import java.time.*;

public class Przyklad {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();

        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(instant);

        Clock clock = Clock.system(ZoneId.of("America/Denver"));
        LocalDateTime localDateTimeOtherTz = LocalDateTime.now(clock);
        LocalDate localDateOtherTz = LocalDate.now(clock);
        LocalTime localTimeOtherTz = LocalTime.now(clock);
        Instant instantOtherTz = Instant.now(clock);

        System.out.println(localDateTimeOtherTz);
        System.out.println(localDateOtherTz);
        System.out.println(localTimeOtherTz);
        System.out.println(instantOtherTz);

        LocalDateTime createdDateTime = LocalDateTime.of(2019, 12, 07, 12, 11, 43);
        LocalDate createdLocalDate = LocalDate.of(2019, 12, 8);
        LocalTime createdTime = LocalTime.of(12, 11, 32);

        System.out.println(createdDateTime);
        System.out.println(createdLocalDate);
        System.out.println(createdTime);

        LocalDateTime parsedLocalDateTime = LocalDateTime.parse("2007-12-03T10:15:30");
        LocalDate parsedLocalDate = LocalDate.parse("2007-12-03");
        LocalTime parsedLocalTime = LocalTime.parse("10:15:30");

        System.out.println(parsedLocalDateTime);
        System.out.println(parsedLocalDate);
        System.out.println(parsedLocalTime);

    }
}
