package pl.camp.it.rozne.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2022, 2, 20);
        System.out.println(data);

        LocalTime time = LocalTime.of(12, 25,4);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime.of(data, time);


        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(dateTime, ZoneId.of("Europe/Paris"));
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(2010, 5, 13, 13, 23, 23, 0, ZoneId.of("Australia/Sydney"));

        Instant instant = zonedDateTime1.toInstant();
        Instant instant2 = zonedDateTime2.toInstant();

        Duration przedzialczasu = Duration.between(instant, instant2);

        System.out.println(instant);
        System.out.println(instant2);
        System.out.println(przedzialczasu);

        System.out.println(przedzialczasu.toHours());

        String dataZFormularza = "2022/06/05";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate dataLokalna = LocalDate.parse(dataZFormularza, formatter);

        System.out.println(dataLokalna);

        String dataPoFormatowaniu = dataLokalna.format(formatter);

        System.out.println(dataPoFormatowaniu);

        ZonedDateTime zonedDateTime3 = ZonedDateTime.of(
                LocalDateTime.of(
                        LocalDate.of(2020, 4, 7),
                        LocalTime.of(14, 15, 40)),
                ZoneId.of("Europe/Paris")
        );

        LocalDate weekAfter = dataLokalna.minusDays(10);

        System.out.println(dataLokalna);
        System.out.println(weekAfter);
    }
}
