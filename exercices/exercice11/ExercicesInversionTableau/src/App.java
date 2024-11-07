public class App {

    public static final int MIN = 0;
    public static final int MAX = 100;

    public static int[] inverseLeTableau(int[] tableau) {
        int[] tableauInverse = new int[tableau.length];

        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[tableau.length - 1 - i];
        }

        return tableauInverse;
    }

    public static void main(String[] args) {

        int[] tableau = { 12, 5, 8, 14 };
        int[] tableauInverse = inverseLeTableau(tableau);
        System.out.println("Constante MIN : " + MIN);
        System.out.println("Constante MAX : " + MAX);

        System.out.print("Tableau retourné : ");
        for (int val : tableauInverse) {
            System.out.print(val + " ");
        }

    }
}
