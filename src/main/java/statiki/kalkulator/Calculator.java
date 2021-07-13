package statiki.kalkulator;

public class Calculator {

    static int sum(int a, int b){
        return a + b;
    }

    static int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        int suma = sum(2, 4);
        int iloczyn = multiply(4, 5);

        System.out.println("suma: " + suma);
        System.out.println("iloczyn: " + iloczyn);
    }
}
