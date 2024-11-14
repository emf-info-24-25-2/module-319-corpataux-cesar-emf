public class App {
    public static void main(String[] args) {
        // Constantes
        final int TAILLE_TABLEAU = 10;
        final int VALEUR_MIN = 1;
        final int VALEUR_MAX = 6;

        // Création du tableau de notes
        int[] notes = new int[TAILLE_TABLEAU];

        // Remplissage du tableau avec des valeurs aléatoires entre 1 et 6
        int somme = 0;
        for (int i = 0; i < TAILLE_TABLEAU; i++) {
            notes[i] = (int)(Math.random() * VALEUR_MAX) + VALEUR_MIN;
            somme += notes[i]; // Ajout de la note à la somme totale
        }

        // Calcul de la moyenne
        double moyenne = (double)somme / TAILLE_TABLEAU;

        // Affichage des notes et de la moyenne
        System.out.println("Notes des élèves :");
        for (int i = 0; i < TAILLE_TABLEAU; i++) {
            System.out.println("Élève " + (i + 1) + " : " + notes[i]);
        }
        System.out.println("Moyenne de la classe : " + moyenne);
    }
}
