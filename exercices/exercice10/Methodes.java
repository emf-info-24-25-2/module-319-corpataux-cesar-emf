public class Methodes {
    public void direBonjour() {
        System.out.println("Bonjour");
    }

    public static void main(String[] args) {
        Methodes methodes = new Methodes();
        methodes.direBonjour();
    }
}

/*Voici une explication détaillée de chaque partie du code :

Déclaration de la classe : "Exemple" est le nom de la classe. En Java, chaque programme doit être contenu dans une classe. Le mot-clé public signifie que cette classe est accessible depuis n'importe quel autre code.

Déclaration de la méthode : direBonjour est le nom de la méthode.

public : La méthode est publique, donc accessible depuis d'autres classes (si nécessaire).
static : La méthode appartient à la classe elle-même et non aux instances de la classe. Cela signifie que nous pouvons l'appeler directement sans créer d'objet de type Exemple.
void : La méthode ne retourne rien, elle ne renvoie aucune valeur.
Corps de la méthode : Entre les accolades {}, on définit ce que la méthode fait.

Affichage du message : System.out.println est une commande qui affiche un message dans la console.
"Bonjour" : Le texte entre guillemets est la chaîne de caractères à afficher. Dans ce cas, elle affiche simplement "Bonjour".

Méthode main : C'est la méthode de démarrage de tout programme Java. C'est ici que l'exécution du programme commence.
public static void main(String[] args) : Cette ligne est la signature de la méthode main, nécessaire pour exécuter le programme.
direBonjour(); : Cette ligne appelle la méthode direBonjour pour qu'elle exécute le code qu'elle contient, c'est-à-dire afficher "Bonjour".*/

