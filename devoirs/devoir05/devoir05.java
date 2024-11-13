import java.util.Scanner;
import java.util.Random;

//RIF: très bien!
public class devoir05 {
    public static void main(String[] args) {
 // Générer un nombre aléatoire entre 1 et 100
 Random random = new Random();
 int nombreADeviner = random.nextInt(100) + 1;

 // créer un scanner pour lire ce que le joueur écrit
 Scanner scanner = new Scanner(System.in);

 // créer la variable pour compter les tentatives du joueur.
 int tentative = 0;
 int nombreEssai;

 // faire la boucle pour permettre de faire des essais.
 while (true) {

     // Demander au joueur de saisir un nombre.
     System.out.print("Devinez un nombre entre 1 et 100 : ");
     nombreEssai = scanner.nextInt();
     tentative++;  // Incrémenter le compteur de tentatives.

     // Si le nombre est trop grand, indiquer "trop grand".
     if (nombreEssai > nombreADeviner) {
         System.out.println("Trop grand !");
     } 
     // Si le nombre est trop petit, indiquer "trop petit".
     else if (nombreEssai < nombreADeviner) {
         System.out.println("Trop petit !");
     } 
     // Si le joueur a trouvé le bon nombre, indiquer "Bravo, trouvé !"
     else {
         System.out.println("Bravo, trouvé ! Vous avez deviné en " + tentative + " essais.");
         break;  // Sortir de la boucle lorsque le nombre est trouvé.
     }
 }

 // Fermer le scanner pour éviter les fuites de mémoire.
 scanner.close();



















    }
}
