package statiki.kalkulator;

public class Main {
    public static void main(String[] args) {
        int suma = Calculator.sum(3, 6);
        int iloczyn = Calculator.multiply(2, 5);

        System.out.println("suma: " + suma);
        System.out.println("iloczyn: " + iloczyn);
    }
}
