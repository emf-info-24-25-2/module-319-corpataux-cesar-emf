public class App {
    

//Créez les constantes LIBRE, OCCUPEE et TOUCHEE qui contiendront des entiers avec les valeurs 0, 1 et 2.
    public final static int LIBRE=0;
    public final static int OCCUPEE=1;
    public final static int TOUCHEE=2;


//Créez les constantes TAILLE_GRILLE et NBRE_BATEAUX qui contiendront des entiers avec les valeurs 20 et 5.
    public final static int TAILLE_GRILLE=20;
    public final static int NBRE_BATEAUX=5;


/*Créez une méthode nommée choisirIndexAleatoire() qui prendra deux entiers en paramètre (min et max)
et qui retournera un entier aléatoire dont la valeur sera comprise entre les limites passées en paramètres.*/
    public static int choisirIndexAleatoire(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Le minimum doit être inférieur ou égal au maximum.");
        }
        return min + (int) (Math.random() * ((max - min) + 1));
    }


/*Créez  une  méthode  nommée  genererGrille().  Cette  méthode  sera  responsable  de  créer  et  retourner  un  
tableau qui représente la grille avec les bateaux placés à l'intérieur
La  taille  de  la  grille  à  générer  ainsi  que  le  nombre  de  bateaux  à  placer  seront  passés  en  paramètres  sous  forme  
d'entiers. Pour implémenter cette méthode, réalisez les opérations suivantes*/

    public static int[] genererGrille(int taille, int nombreBateaux) {
        


// Étape 5.1 : Créer un tableau avec la taille passée en paramètre
// Initialiser la grille avec toutes les cellules marquées comme libres
        int[] grille = new int[taille];
        for (int i = 0; i < taille; i++) {
            grille[i] = LIBRE;
        }


// Étape 5.2 : Déclarez une variable entière nommée nbreBateauxPlaces
// Initialiser cette variable à 0
        int nbreBateauxPlaces = 0;


// Étape 5.3 : Tant que le nombre de bateaux placés est inférieur au nombre de bateaux à placer
        while (nbreBateauxPlaces < nombreBateaux) {


// 5.3.1 : Choisissez un index aléatoire dans la grille
            int ligne = choisirIndexAleatoire(0, taille - 1);


// 5.3.2 : Si la cellule est libre, placez un bateau et incrémentez le compteur
            if (grille[ligne] == LIBRE) {
                grille[ligne] = OCCUPEE;
                nbreBateauxPlaces++;
            }
        }

        return grille;
    }


    /*6. Créez  une  méthode  nommée  testerGrille()  qui  prend  un  paramètre  un  tableau  d'entier.  Cette  méthode  
retourne la valeur false s'il y a encore des cellules avec la valeur OCCUPEE dans le tableau passé en paramètre. 
S'il toutes les cellules sont LIBRE ou TOUCHEE, la méthode doit retourner true.*/

public static boolean testerGrille (int[] plateau){
    boolean resultat=true;
    for (int i=0; i < plateau.length; i++){
        if (plateau[i] == OCCUPEE) {
            resultat = false;
        }
    }
    return resultat;
}


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
