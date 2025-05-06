public class devoir07_1 {

    public final static int TAILLE_TABLEAU = 10;
    public final static int MIN_NOMBRE = -8;
    public final static int MAX_NOMBRE = 8;
    public final static int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {

    }

    public static int[] genererValeursAleatoires(int nombreValeursAGenerer, int plusPetiteValeur, int plusGrandeValeur) {
        int[] tableauCree = new int[nombreValeursAGenerer];

        for (int i = 0; i < tableauCree.length; i++) {
            tableauCree[i]=(int)(Math.random()*(plusGrandeValeur - plusPetiteValeur +1) + plusPetiteValeur);
        }
        return tableauCree;
    }

}
