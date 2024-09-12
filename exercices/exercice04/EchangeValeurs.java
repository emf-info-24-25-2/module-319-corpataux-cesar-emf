package exercices.exercice04;

public class EchangeValeurs {
    public static void main(String[] args) {
        int variable1=18;
        int variable2=30;

        System.out.println("le contenu de la variable 1 est " + (variable1));
        System.out.println("le contenu de la variable 2 est " + (variable2));

        int variable3;

        variable3 = variable1;
        variable1 = variable2;
        variable2 = variable3;

        System.out.println(".... Traitement ....");
        System.out.println("le contenu de la variable 1 est " + (variable1));
        System.out.println("le contenu de la variable 2 est " + (variable2));







 





    }
}
