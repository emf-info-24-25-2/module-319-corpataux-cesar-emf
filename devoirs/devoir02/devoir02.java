public class devoir02 {
    // Constantes pour les capacités des réservoirs
    static final int CAPACITE_RESERVOIR_A = 3;
    static final int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {
        // Variables pour les réservoirs
        int reservoirA = 0;
        int reservoirB = 0;

        // Génération d'une valeur aléatoire pour le remplissage
        int remplissage = ( int ) ( Math.random() * (CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B - 0 + 1 ) );

        // Affichage de la quantité à remplir
        System.out.println("Il y a " + remplissage + " litres à remplir.");

        // Boucle de remplissage des réservoirs
        while (reservoirA + reservoirB < remplissage) {
            if (reservoirA < CAPACITE_RESERVOIR_A) {
                reservoirA++;
                System.out.println("Remplissage du réservoir A...");
            } else if (reservoirB < CAPACITE_RESERVOIR_B) {
                reservoirB++;
                System.out.println("Remplissage du réservoir B...");
            }

            // Affichage des niveaux des réservoirs
            System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B : " + reservoirB);
        }

        // Affichage de la fin du remplissage
        System.out.println("Remplissage terminé!");}}