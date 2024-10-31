public class App {
    public static void main(String[] args) throws Exception {
        String maChaineDeCaractere;
        maChaineDeCaractere = "Voici du contenu stocké dans un string";
        System.out.println("Le nombre de caractères est : " + maChaineDeCaractere.length());
        System.out.println("La position du mot 'contenu' est : " + maChaineDeCaractere.indexOf("contenu"));
        System.out.println("Le caractère à la position 10 est : " + maChaineDeCaractere.charAt(14));



        String monPrenom;
        monPrenom = "César";
        for (int i = 0; i < monPrenom.length(); i++) {
            System.out.println("La lettre à la position " +i +" est : " + monPrenom.charAt(i));
        }

        if (monPrenom.contains("test")) {
            System.out.println("La chaîne de caractère \"" + monPrenom + "\" contient le texte \"test\".");
        } else {
            System.out.println("La chaîne de caractère \"" + monPrenom + "\" ne contient pas le texte \"test\".");
        }








    }
}
