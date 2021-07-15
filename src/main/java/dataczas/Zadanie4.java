package dataczas;

import java.time.LocalDate;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        //tresc: wczytaj date (bez godziny) od uzytkownika, dodaj do niej 10 dni i wyswietl

        System.out.println("podaj date w formacie yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        LocalDate parsedDate = LocalDate.parse(input);
        parsedDate = parsedDate.plusDays(10);
        System.out.println(parsedDate);
    }
}
