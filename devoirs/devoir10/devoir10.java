public class devoir10 {
    public final static int NBRE_ESSAIS = 100000;

    public static void main(String[] args) throws Exception {

        int compteur = 0;

        for (int i = 0; i < NBRE_ESSAIS; i++) {
            double x = Math.random();
            double y = Math.random();

            double hypotenuse = x * x + y * y;

            if (hypotenuse <= 1) {
                compteur++;
            }
        }

        double estimation = 4.0 * (double) compteur / NBRE_ESSAIS;

        System.out.println("Estimation de π avec " + NBRE_ESSAIS + " essais : " + estimation);
    }
}
