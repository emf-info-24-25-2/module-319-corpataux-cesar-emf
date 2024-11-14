public class ExerciceBoucles1 {
    public static void main(String[] args) {
        // Affichage avec une boucle for
        System.out.println("Boucle for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Boucle for, itération " + i);
        }

        // Affichage avec une boucle while
        System.out.println("\nBoucle while:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Boucle while, itération " + j);
            j++;
        }

        // Affichage avec une boucle do-while
        System.out.println("\nBoucle do-while:");
        int k = 1;
        do {
            System.out.println("Boucle do-while, itération " + k);
            k++;
        } while (k <= 5);

        // Boucle for avec saut de l'itération 3
        System.out.println("\nBoucle for (saut de l'itération 3):");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Sauter l'itération 3
            }
            System.out.println("Boucle for, itération " + i);
        }

        // Boucle while avec arrêt après l'itération 3
        System.out.println("\nBoucle while (arrêt après l'itération 3):");
        int l = 1;
        while (l <= 5) {
            System.out.println("Boucle while, itération " + l);
            if (l == 3) {
                break; // Arrêter la boucle après l'itération 3
            }
            l++;
        }
    }
}
