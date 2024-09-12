package exercices.exercice06;

public class ExerciceSwitch1 {
    public static void main(String[] args) {

        
          int noteDuModule = 7;
          

          

        if (noteDuModule == 1) {
          System.out.println("Travail non rendu");
          }
          if (noteDuModule == 2) {
          System.out.println("Très insuffisant");
          }
          if (noteDuModule == 3) {
          System.out.println("Insuffisant");
          }
          if (noteDuModule == 4) {
          System.out.println("Suffisant");
          }
          if (noteDuModule == 5) {
          System.out.println("Bien");
          }
          if (noteDuModule == 6) {
          System.out.println("Très bien");
          }
         
          



        switch (noteDuModule) {
            case 1:

            System.out.println("Travail non rendu");
                break;

            case 2:
                System.out.println("Très insuffisant");
                break;

            case 3:
                System.out.println("Insuffisant");
                break;
            
            case 4:
                System.out.println("Suffisant");
                break;

            case 5:
            System.out.println("Bien");
                break;

            case 6:
            System.out.println("Très bien");
                break;
                
            default:
            System.out.println("note invalide");
                break;
        }

    }
}
