public class break_test {
    public static void main(String[] args) {


    int note = 4;
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
        
                        
                    case 5:
                        System.out.println("bien !");
        
                        break;
                    case 6:
                        System.out.println("très bien !");
        
                        break;
        
                    default:
                        break;
                }
            
        
                for (int i = 0; i < 5; i++) {
                    if (i == 3) {
                        break; // Arrêter la boucle quand i est égal à 3
                    }
                    System.out.println("i = " + i);
                }
        
                
        
                
            }
        }
