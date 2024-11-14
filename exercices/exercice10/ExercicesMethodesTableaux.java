public class ExercicesMethodesTableaux {

    // Créer un tableau d'entiers d'une taille donnée
    public static int[] creerTableau(int taille) {
        return new int[taille];
    }

    // Remplir un tableau avec une valeur fixe
    public static int[] remplirAvecValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeur;
        }
        return tableau;
    }

    // Remplir un tableau avec des valeurs aléatoires
    public static int[] remplirAvecValeursAleatoires(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * 100); // Valeur aléatoire entre 0 et 99
        }
        return tableau;
    }

    // Déterminer la taille d'un tableau
    public static int determinerTaille(int[] tableau) {
        return tableau.length;
    }

    // Afficher le contenu d'un tableau
    public static void afficherTableau(int[] tableau) {
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }

    // Rechercher la valeur minimum d'un tableau
    public static int trouverMinimum(int[] tableau) {
        int min = tableau[0];
        for (int valeur : tableau) {
            if (valeur < min) {
                min = valeur;
            }
        }
        return min;
    }

    // Rechercher la valeur maximum d'un tableau
    public static int trouverMaximum(int[] tableau) {
        int max = tableau[0];
        for (int valeur : tableau) {
            if (valeur > max) {
                max = valeur;
            }
        }
        return max;
    }

    // Compter la fréquence d'une valeur dans un tableau
    public static int compterFrequence(int[] tableau, int valeur) {
        int compteur = 0;
        for (int element : tableau) {
            if (element == valeur) {
                compteur++;
            }
        }
        return compteur;
    }

    // Calculer la somme des valeurs dans un tableau
    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }
        return somme;
    }

    // Calculer la moyenne des valeurs dans un tableau
    public static double calculerMoyenne(int[] tableau) {
        if (tableau.length == 0) return 0;
        return (double) calculerSomme(tableau) / tableau.length;
    }

    // Remplacer une valeur par une autre dans un tableau
    public static int[] remplacerValeur(int[] tableau, int ancienneValeur, int nouvelleValeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == ancienneValeur) {
                tableau[i] = nouvelleValeur;
            }
        }
        return tableau;
    }

    // Rechercher la première occurrence d'une valeur dans un tableau
    public static int rechercherPremiereOccurrence(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1; // Valeur non trouvée
    }

    // Rechercher la dernière occurrence d'une valeur dans un tableau
    public static int rechercherDerniereOccurrence(int[] tableau, int valeur) {
        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1; // Valeur non trouvée
    }

    // Méthode principale pour tester les méthodes
    public static void main(String[] args) {
        int[] tableau = creerTableau(10);
        remplirAvecValeur(tableau, 5);
        afficherTableau(tableau);

        remplirAvecValeursAleatoires(tableau);
        afficherTableau(tableau);

        System.out.println("Taille du tableau: " + determinerTaille(tableau));
        System.out.println("Minimum: " + trouverMinimum(tableau));
        System.out.println("Maximum: " + trouverMaximum(tableau));
        System.out.println("Fréquence de 5: " + compterFrequence(tableau, 5));
        System.out.println("Somme: " + calculerSomme(tableau));
        System.out.println("Moyenne: " + calculerMoyenne(tableau));

        remplacerValeur(tableau, tableau[0], -1);
        afficherTableau(tableau);

        System.out.println("Première occurrence de -1: " + rechercherPremiereOccurrence(tableau, -1));
        System.out.println("Dernière occurrence de -1: " + rechercherDerniereOccurrence(tableau, -1));
    }
}
