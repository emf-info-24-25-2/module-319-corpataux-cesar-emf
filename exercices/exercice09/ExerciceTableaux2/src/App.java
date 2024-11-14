public class App {
    public static void main(String[] args) {
        // Déclaration des constantes
        final int TAILLE_TABLEAU = 10;
        final int VALEUR_MIN = 1;
        final int VALEUR_MAX = 6;

        // Création du tableau
        int[] tableau = new int[TAILLE_TABLEAU];

        // Remplissage du tableau avec des valeurs aléatoires entre 1 et 6
        for (int i = 0; i < TAILLE_TABLEAU; i++) {
            tableau[i] = (int)(Math.random() * VALEUR_MAX) + VALEUR_MIN;
        }

        // Affichage du contenu du tableau
        System.out.println("Contenu du tableau de valeurs aléatoires :");
        for (int i = 0; i < TAILLE_TABLEAU; i++) {
            System.out.println("Cellule " + i + " : " + tableau[i]);
        }
    }
}
