public class IfSwitch {
    public static void main(String[] args) {

        int note = 6;

        System.out.println("Ma note est : " + note);

        if (note < 4) {
            System.out.println("ma note est insuffisante.");
        }

        else if (note < 6) {
            System.out.println("ma note est suffisante mais peut être amélioré.");
        }

        else {
            System.out.println("ma note est suffisante.");
        }

        switch (note) {
            case 1:
                System.out.println("J'ai triché, c'est mal");

                break;
            case 2:
                System.out.println("Y a du boulot !");

                break;
            case 3:
                System.out.println("encore un effort !");

                break;
            case 4:
                System.out.println("juste juste !");

                break;
            case 5:
                System.out.println("bien !");

                break;
            case 6:
                System.out.println("très bien !");

                break;

            default:
                break;
        }
    }
}