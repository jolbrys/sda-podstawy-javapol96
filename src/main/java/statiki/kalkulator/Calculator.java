package statiki.kalkulator;

import java.util.Scanner;

public class Calculator {

    //pola statyczne - tzn że ich wartość jest atrybutem/cechą klasy samej w sobie
    //możemy w nich przechowywać wartości, które będą wspólne dla wszystkich obiektów
    //klasy, jesli zamierzamy je tworzyc
    private static String ZNAK;
    private static double a;
    private static double b;

    //metody ktore wykorzystujemy do obliczen.
    //sa one:
        //1. prywatne - dlatego ze chcemy je wykorzystywac tylko wewnatrz innej metody w klasie Calculator i nie ma potrzeby udostepniac je na zewnatrz (np do klasy Main)
        //2. statyczne - dlatego ze chcemy je wywolywac bez potrzeby tworzenia obiektu. dodatkowo pola na których chcemy operowac są statyczne, wiec nie potrzebujemy cech obiektu zeby wykonac te operacje ktore nas interesuja (te operacje to dodawanie, odejmowanie itd. statycznych pól)
        //3. typu double - no bo zwracaja wynik dzialania
        //4. nie przyjmuja argumentów - nie ma takiej potrzeby, bo wartosci na ktorych chcemy operowac są już atrybutem/cechą klasy, zostały wczytane i przypisane do statycznych pól już wcześniej przy wywołaniu metody zczytajDane()
    private static double sum(){
        return a + b;
    }

    private static double substract(){
        return a - b;
    }

    private static double multiply(){
        return a * b;
    }

    private static double divide(){
        return a / b;
    }

    private static double modulo(){
        return a % b;
    }

    public static void zczytajDane(){
        Scanner scanner = new Scanner(System.in);
//zczytujemy dwie liczby i jeden znak (jako string) które przypisujemy do odpowiednich
        //statycznych pól klasy Calculator
        System.out.println("podaj 1 liczbe");
        a = scanner.nextDouble();

        System.out.println("podaj 2 liczbe");
        b = scanner.nextDouble();

        System.out.println("podaj znak");
        ZNAK = scanner.next();
    }

    public static void oblicz(){
        //zmienna na wynik
        double wynik;
        //switch case, wywolujacy odpowiednie metody do obliczen które napisalismy wczesniej,
        //w zaleznosci od znaku
        switch (ZNAK){
            case "+": {
                wynik = sum();
                System.out.println(wynik);
                break;
            }
            case "-": {
                wynik = substract();
                System.out.println(wynik);
                break;
            }
            case "*": {
                wynik = multiply();
                System.out.println(wynik);
                break;
            }
            case "/": {
                wynik = divide();
                System.out.println(wynik);
                break;
            }
            case "%": {
                wynik = modulo();
                System.out.println(wynik);
                break;
            } default: {
                System.out.println("wrong sign");
            }
            //defaultowa sciezka nie wywoluje zadnej metody z obliczeniami tylko drukuje informacje ze znak wprowadzony przez uzytkownika nie jest przewidziany przez logike programu
        }
    }




}
