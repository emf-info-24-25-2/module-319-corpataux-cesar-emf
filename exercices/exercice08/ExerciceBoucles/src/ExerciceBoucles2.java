public class ExerciceBoucles2 {
    public static void main(String[] args) {
        // Affichage avec une boucle for
        System.out.println("Boucle for:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Décollage !!");

        // Affichage avec une boucle while
        System.out.println("\nBoucle while:");
        int j = 5;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
        System.out.println("Décollage !!");

        // Affichage avec une boucle do-while
        System.out.println("\nBoucle do-while:");
        int k = 5;
        do {
            System.out.println(k);
            k--;
        } while (k >= 1);
        System.out.println("Décollage !!");
    }
}
