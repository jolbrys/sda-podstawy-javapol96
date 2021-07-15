package tablice;

public class Przyklad2 {
    public static void main(String[] args) {
        int[][] tablicaEmpty = new int[4][4];
        int[][] tablica = {{1, 2, 5, 2, 5}, {1, 6}, {9, 2, 9}, {1}, {2, 1, 5} };
        int[][] tablica1 = {{1, 2, 5}, {1, 6, 1}, {9, 2, 9}, {2, 1, 5} };
        int[][] tablica2 = {{1, 2, 5}, {1, 6, 1}, {9, 2, 9} };

        for(int[] tab : tablica){
            for(int t : tab){
                System.out.print(t + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < tablica[i].length; j++){
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }

    }
}
