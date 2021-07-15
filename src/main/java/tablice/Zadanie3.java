package tablice;

import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        //1. stworz tablice z losowymi wartosciami
        //2. zczytamy liczbe od uzytkownika
        //3. sprawdzimy czy podana liczba znajduje sie w tablicy no i drukujemy stosowna informacje

        //4.* zmodyfikuj powyższe tak, żeby w przypadku kiedy taka liczba jest w tablicy, wypisał jej indeks

        Random r = new Random();
        int[] tablica = new int[15];

//wypelnianie tablicy losowymi liczbami
        for(int i = 0; i < tablica.length; i++){
            tablica[i] = r.nextInt(20);
        }

        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe: ");
        int liczba = scanner.nextInt();

    }
}
