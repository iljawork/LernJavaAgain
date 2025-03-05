package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    private static int i = 0;
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2000, 10, 23);
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);

        System.out.println(i + " - " + birthday.format(formatter));
        while (birthday.isBefore(now)) {
            birthday = birthday.plusYears(1);
            ++i;
            System.out.println(i + " - " + birthday.format(formatter));
        }
    }
}