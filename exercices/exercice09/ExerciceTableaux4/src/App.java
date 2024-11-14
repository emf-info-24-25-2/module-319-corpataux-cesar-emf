import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Constante
        final int NOMBRE_ELEMENTS = 5;

        // Demande du nombre de départ
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre de départ : ");
        int nombreDepart = scanner.nextInt();

        // Création du tableau
        int[] nombresSuivants = new int[NOMBRE_ELEMENTS];

        // Remplissage du tableau avec les nombres suivants
        for (int i = 0; i < NOMBRE_ELEMENTS; i++) {
            nombresSuivants[i] = nombreDepart + (i + 1);
        }

        // Affichage du contenu du tableau
        System.out.println("Les 5 nombres suivants sont :");
        for (int i = 0; i < NOMBRE_ELEMENTS; i++) {
            System.out.println("Cellule " + i + " : " + nombresSuivants[i]);
        }

        // Fermeture du scanner
        scanner.close();
    }
}
