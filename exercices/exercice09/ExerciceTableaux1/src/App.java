public class App {
    public static void main(String[] args) {
        // Déclaration et création d'un tableau de chaînes de caractères
        String[] tableauString = {"Bonjour", "Java", "Tableau"};

        // Affichage du contenu du tableau de chaînes
        System.out.println("Contenu du tableau de chaînes :");
        for (int i = 0; i < tableauString.length; i++) {
            System.out.println("Cellule " + i + " : " + tableauString[i]);
        }
    }
}
