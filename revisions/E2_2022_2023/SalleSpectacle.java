package revisions.E2_2022_2023;

import java.util.Scanner;

public class SalleSpectacle {
    public final static int PRIX_CATEGORIE_UN = 25;
    public final static int PRIX_CATEGORIE_DEUX = 18;
    public final static int PRIX_CATEGORIE_TROIS = 12;
    public final static int[] CATEGORIE_SALLE = new int[] { 3, 3, 2, 2, 1, 1, 2, 2, 3, 3 };

    public static void afficherTarifs() {
        System.out.println("Catégorie 1 : " + PRIX_CATEGORIE_UN);
        System.out.println("Catégorie 2 : " + PRIX_CATEGORIE_DEUX);
        System.out.println("Catégorie 3 : " + PRIX_CATEGORIE_TROIS);
    }

    public static void afficherSalle(boolean[] occupationSalle) {
        System.out.println("Occupation de la salle :");
        for (int categorie : CATEGORIE_SALLE) {
            System.out.println(categorie + "");
        }
        System.out.println();

        System.out.println("Occupation : ");
        for (boolean estOccupe : occupationSalle) {
            if (estOccupe) {
                System.out.println("O ");
            } else {
                System.out.println("X ");
            }
        }
        System.out.println();

    }

    public static int trouverPlace(int categorie, boolean[] occupationSalle) {
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
            if (CATEGORIE_SALLE[i] == categorie) {
                if (!occupationSalle[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean[] commanderBillet(boolean[] occupationSalle) {
        Scanner scanner = new Scanner();
        System.out.println("Quelle catégorie voulez-vous : ");
        int categorie = scanner.nextInt();

        if (categorie == 1 || categorie == 2 || categorie == 3) {
            int positionPlace = trouverPlace(occupationSalle, categorie);

            if (positionPlace != -1) {
                occupationSalle[positionPlace] = true;

                int prix = 0;
                switch (categorie) {
                    case 1:
                        prix = 25;
                        break;

                    case 2:
                        prix = 18;
                        break;

                    case 3:
                        prix = 12;
                        break;
                }
                System.out.println("Votre place est réservée et coûte " + prix + " CHF");
            } else {
                System.out.println("Aucune place n'est disponible");
            }
        } else {
            System.out.println("Cette catégorie n'existe pas");
        }
        return occupationSalle;
    }

    public static void main(String[] args) {

        boolean[] occupationSalle = new boolean[CATEGORIE_SALLE.length];
        int commande = -1;
        Scanner scanner = new Scanner(System.in);

        while (commande != 0) {
            System.out.println("--------------------------------------------------");
            System.out.println(
                    "1 = Commander un billet, 2 = Afficher les tarifs, 3 = Afficher l'état de la salle, 0 = Quitter");
            System.out.print("Quelle opération voulez-vous faire : ");
            commande = scanner.nextInt();

            switch (commande) {
                case 0:
                    System.out.println("Au revoir");
                    break;
                case 1:
                    occupationSalle = commanderBillet(occupationSalle);
                    break;
                case 2:
                    afficherTarifs();
                    break;
                case 3:
                    afficherSalle(occupationSalle);
                    break;
                default:
                    System.out.println("Commande inconnue");
                    break;
            }
        }
        scanner.close();

    }
}