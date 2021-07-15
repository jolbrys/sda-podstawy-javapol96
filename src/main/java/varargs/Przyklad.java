package varargs;

public class Przyklad {
    public static void main(String[] args) {

        System.out.println("arg1: " + args[0] + " arg2: " + args[1] + " arg3: " + args[2]);

        int[] tablica1 = {1, 5, 2, 6, 5, 7};
        int[] tablica2 = {10, 21, 55};

        metodaJeden(tablica1);
        metodaJeden(tablica2);

        System.out.println();
        System.out.println();
        System.out.println();

        metodaDwa(1, 5, 23, 6, 1, 7, 90, 21, 6);
        metodaDwa(1, 1, 1098, 49, 178, 49);


    }

    private static void metodaJeden(int[] vararg){
       for(int element : vararg){
           System.out.print(element + " ");
       }
        System.out.println();
    }

    private static void metodaDwa( int... vararg){
        for(int element : vararg){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}