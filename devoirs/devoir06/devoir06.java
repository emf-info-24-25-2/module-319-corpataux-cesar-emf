package devoir06;

public class devoir06 {

    private static final int TAILLE_TABLEAU = 20;
    private static final int VALEUR_MIN = 0;
    private static final int VALEUR_MAX = 50;
    private static final int VALEUR_RECHERCHEE = 7;

    public static int[] genereTableau(int taille, int min, int max) {
        int[] tableau = new int[taille];
        for (int i = 0; i < taille; i++) {

            tableau[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return tableau;
    }

    public static int rechercheMin(int[] tableau) {
        int min = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        return min;
    }

    public static int rechercheMax(int[] tableau) {
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    public static int rechercheValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] tableau = genereTableau(TAILLE_TABLEAU, VALEUR_MIN, VALEUR_MAX);

        System.out.println("Tableau généré : ");
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();

        int min = rechercheMin(tableau);
        System.out.println("Valeur minimale du tableau : " + min);

        int max = rechercheMax(tableau);
        System.out.println("Valeur maximale du tableau : " + max);

        int position = rechercheValeur(tableau, VALEUR_RECHERCHEE);
        if (position != -1) {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " se trouve à l'index : " + position);
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " n'est pas présente dans le tableau.");
        }
    }

}
