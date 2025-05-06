public class devoir07 {

    public final static int TAILLE_TABLEAU = 10;
    public final static int MIN_NOMBRE = -8;
    public final static int MAX_NOMBRE = 8;
    public final static int VALEUR_RECHERCHEE = 7;

    public static int[] genererValeursAleatoires(int nbr, int min, int max) {
        int[] tableau = new int[nbr];

        for (int i = 0; i < nbr; i++) {
            tableau[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        return tableau;
    }

    public static int[] positionValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] tableau = genererValeursAleatoires(TAILLE_TABLEAU, MIN_NOMBRE, MAX_NOMBRE);

        System.out.println("Le tableau d'entiers généré contient : " + TAILLE_TABLEAU + " valeurs");
        System.out.print("Les deux premières/dernières valeurs sont : ");
        System.out.print("[" + tableau[0] + "][" + tableau[1] + "] ");
        System.out.print("... ");
        System.out.println("[" + tableau[tableau.length - 2] + "][" + tableau[tableau.length - 1] + "]");

        int position = positionValeur(tableau, VALEUR_RECHERCHEE);

        if (position != -1) {
            System.out.println(
                    "La valeur " + VALEUR_RECHERCHEE + " figure à la position N°" + (position + 1) + " du tableau !");
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " n'est pas présente dans le tableau.");
        }
        System.out.print("Voici le contenue du tableau : ");
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
    }
}
