package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {

        System.out.println("Choisissez un nombre entre 1 et 100 :");
        Scanner scanner = new Scanner(System.in);
        int nombreAtrouver;
        nombreAtrouver = scanner.nextInt();
        int nombreCoups = 0;


        for (int i = 0; i <= nombreAtrouver; i++) {
            System.out.println("Essayez de trouver le nombre :");
            Scanner scanner2 = new Scanner(System.in);
            int nombreChoisi;
            nombreChoisi = scanner.nextInt();
            if (nombreChoisi == nombreAtrouver) {
                System.out.println("Bravo, vous avez trouvé en " + nombreCoups + " coups");
                break;
            } else if (nombreChoisi < nombreAtrouver) {
                System.out.println("c'est +");
                nombreCoups++;
                Scanner scanner3 = new Scanner(System.in);
            } else if (nombreChoisi > nombreAtrouver) {
                System.out.println("c'est -");
                nombreCoups++;
                Scanner scanner3 = new Scanner(System.in);
            }

        }
    }
}
