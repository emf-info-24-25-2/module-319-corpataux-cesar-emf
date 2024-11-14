package devoir03;

import java.util.Scanner;

public class devoir03 {
    public static void main(String[] args) {

        int jour, mois, annee;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entrez le jour : ");
            jour = sc.nextInt();
            System.out.println("Entrez le mois : ");
            mois = sc.nextInt();
            System.out.println("Entrez l'année : ");
            annee = sc.nextInt();
        }
        if (annee < 0 || annee > 9999) {
            System.out.println("Année invalide.");
            return;
        }

        if (mois < 1 || mois > 12) {
            System.out.println("Mois invalide.");
            return;
        }

        if (jour < 1 || jour > 31 || (mois == 2 && jour > 29) ||
                ((mois == 4 || mois == 6 || mois == 9 || mois == 11) && jour > 30) ||
                (mois == 2 && jour == 29 && !estBissextile(annee))) {
            System.out.println("Jour invalide.");
            return;
        }

        int numeroJourAnnee = calculerJourDeLAnnee(jour, mois, annee);

        System.out.println("Nous sommes le jour numéro " + numeroJourAnnee + " de l'année " + annee + ".");
    }

    public static int calculerJourDeLAnnee(int jour, int mois, int annee) {
        int[] joursParMois = { 31, (estBissextile(annee) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int numeroJour = 0;

        for (int i = 0; i < mois - 1; i++) {
            numeroJour += joursParMois[i];
        }

        numeroJour += jour;

        return numeroJour;
    }

    public static boolean estBissextile(int annee) {
        if (annee % 4 == 0) {
            if (annee % 100 == 0) {
                return annee % 400 == 0;
            }
            return true;
        }
        return false;

    }
}