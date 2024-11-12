public class devoir04 {
    public static void main(String[] args) {
        // Déclaration des variables
        int year = 2023;  // Remplacez par l'année en cours
        int month = 11;   // Remplacez par le mois en cours
        int day = 12;     // Remplacez par le jour en cours

        // Vérification des limites de l'année
        if (year < 0 || year > 9999) {
            System.out.println("L'année doit être comprise entre 0 et 9999.");
            return;
        }

        // Vérification des limites du mois
        if (month < 1 || month > 12) {
            System.out.println("Le mois doit être compris entre 1 et 12.");
            return;
        }

        // Variable pour stocker le nombre de jours maximum en fonction du mois
        int maxDays;

        // Détermination du nombre maximum de jours selon le mois
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            case 2:
                // Vérification de l'année bissextile pour février
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
                break;
            default:
                maxDays = 0;
                break;
        }

        // Vérification du jour par rapport au mois
        if (day < 1 || day > maxDays) {
            System.out.println("Le jour n'est pas valide pour ce mois.");
            return;
        }

        // Affichage du mois en texte
        String monthText;
        switch (month) {
            case 1: monthText = "Janvier"; break;
            case 2: monthText = "Février"; break;
            case 3: monthText = "Mars"; break;
            case 4: monthText = "Avril"; break;
            case 5: monthText = "Mai"; break;
            case 6: monthText = "Juin"; break;
            case 7: monthText = "Juillet"; break;
            case 8: monthText = "Août"; break;
            case 9: monthText = "Septembre"; break;
            case 10: monthText = "Octobre"; break;
            case 11: monthText = "Novembre"; break;
            case 12: monthText = "Décembre"; break;
            default: monthText = ""; break;
        }

        // Affichage de la date formatée
        System.out.println("Date : " + day + " " + monthText + " " + year);
    }
}
