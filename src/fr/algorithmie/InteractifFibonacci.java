package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {

        // On initialise le scanner qui va nous servir à interagir avec l'utilisateur
        Scanner scan = new Scanner(System.in);

        // On affiche le message invitant l'utilisateur à saisir un rang pour le calcul
        // de la suite
        System.out.println("Saisissez une valeur");

        // On stocke la saisie dans la variable rang
        int rang = scan.nextInt();

        // On créé un tableau de longueur = rang + 1
        int[] tab = new int[rang + 1];

        // On continue seulement si l'utilisateur a saisi un rang positif ou nul
        if (rang >= 0) {

            // Dans ce cas on sait que notre tableau a au moins 1 case
            tab[0] = 0;

            // Si la longueur du tableau est supérieure à
            if (tab.length > 1) {

                // On valorise l'élément de rang 1
                tab[1] = 1;

                // Puis on peut désormais calculer les éléments de la suite de proche en proche
                // jusqu'à la fin du tableau
                // qui correspond à l'élément qu'on souhaite afficher
                for (int i = 2; i < tab.length; i++) {
                    tab[i] = tab[i - 1] + tab[i - 2];
                }
            }

            // On affiche le dernier élément du tableau
            System.out.println(tab[rang]);
        } else {
            System.out.println("Calcul impossible, vous devez saisir un rang positif ou nul.");
        }

        scan.close();
    }
}
