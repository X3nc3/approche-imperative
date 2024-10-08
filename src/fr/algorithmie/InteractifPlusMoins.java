package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {

        System.out.println("Choisissez un nombre entre 1 et 100 :");
        Scanner scanner = new Scanner(System.in);
        int nombreAtrouver;
        nombreAtrouver = scanner.nextInt();
        int nombreCoups = 0;


        /*for (int i = 0; i <= nombreAtrouver; i++) {
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

        }*/

        // On initialise la condition de fin de jeu
        boolean trouve = false;

        // On rentre dans une boucle infinie tant que l'utilisateur n'a pas trouvé le
        // nombre secret
        do {

            // On affiche un message invitant l'utilisateur à saisir une valeur au clavier
            System.out.println("Choisissez un nombre entre 1 et 100:");

            // On attend la saisie de l'utilisateur et on la stocke dans nb
            int nb = scanner.nextInt();

            // Si ce nombre est le nombre secret alors on positionne la variable trouve à
            // true
            if (nb == nombreAtrouver) {
                trouve = true;
            } else {
                // Sinon on compare la saisie de l'utilisateur au nombre secret pour lui
                // afficher
                // un message d'aide
                if (nb > nombreAtrouver) {
                    System.out.println("C'est moins !");

                } else {
                    System.out.println("C'est plus !");
                }
            }
            // Quelle que soit la saisie effectuée par l'utilisateur on ajoute 1 au nombre
            // de coups
            nombreCoups++;

        } while (!trouve);
    }
}
