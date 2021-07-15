package tablice;

import java.util.Arrays;
import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tablica = new int[10];

//wypelnianie tablicy losowymi liczbami
        for(int i = 0; i < tablica.length; i++){
            tablica[i] = r.nextInt(100);
        }

        //sumowanie elementów tablicy
        int suma = 0;
        for(int e : tablica){
            suma += e;
        }

        System.out.println("suma: " + suma);
        System.out.println("srednia: " + suma/tablica.length);

        System.out.println();
        for(int e : tablica){
            if(e % 2 == 0) {
                System.out.print(e + " ");
            }
        }

        System.out.println();
        //sortowanie i drukowanie posortowanej tablicy
        Arrays.sort(tablica);

        //wypisanie tablicy
        for(int e : tablica){
            System.out.print(e + " ");
        }
        System.out.println();

        //liczenie mediany
        double mediana;
        if(tablica.length %2 != 0){
            mediana = tablica[tablica.length/2];
        }else{
            double med1 = tablica[tablica.length/2 - 1];
            double med2 = tablica[tablica.length/2];
            mediana = (med1+med2)/2;
        }

        System.out.println("mediana: " + mediana);
    }
}
