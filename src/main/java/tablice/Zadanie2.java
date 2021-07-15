package tablice;

public class Zadanie2 {
    public static void main(String[] args) {
        String imiona = "";
        String[] tablica = {"Jakub", "Iwo", "Kasia", "Jan", "Magdalena"};
        for(String element : tablica){
            imiona += element + ", ";
        }
        imiona += "\b\b";

        System.out.println(imiona);
    }
}
