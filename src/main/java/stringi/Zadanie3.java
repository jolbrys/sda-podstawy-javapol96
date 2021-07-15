package stringi;

public class Zadanie3 {
    public static void main(String[] args) {
        //wypisz przykładowego stringa, dublując każde słowo
        //(czyli ma wyjść -> Lorem Lorem Ipsum Ipsum Dolor Dolor Sit Sit Amet Amet)
        //podpowiedz - w Stringu jest taka metoda split

        String napis = "Lorem Ipsum Dolor Sit Amet";

        System.out.println(doubleWords(napis));
    }

    public static String doubleWords(String input){
        String result = "";

        for (String word : input.split(" ")){
            result = result + word + " " + word + " ";
        }

        return result;
    }
}
