package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
    public static void main(String[] args) {

        // On initialise le scanner qui va nous servir à interagir avec l'utilisateur
        Scanner scan = new Scanner(System.in);

        // On initialise le nombre de bâtons de départ
        int batons = 21;

        // On initialise la variable dont la valeur permettra de mettre un terme au jeu
        // On l'initialise à false, ce qui signifie que le jeu n'est pas fini et va nous
        // permettre de rentrer dans la boucle while.
        boolean fini = false;

        // Tant que le jeu n'est pas fini, on exécute le bloc associé au while
        while (!fini) {

            // On affiche un message invitant le joueur à saisir entre 1 et 3 bâtons
            System.out.println("Voici " + batons + " batons, vous pouvez en prendre 1, 2 ou 3");

            // On stocke la saisie effectuée par l'utilisateur dans la variable
            // nbBatonsJoueur
            int nbBatonsJoueur = scan.nextInt();

            // On teste la validité de la saisie de l'utilisateur
            if (nbBatonsJoueur > 0 && nbBatonsJoueur < 4) {
                // Si la saisie est correcte on teste si le joueur a pris le dernier bâton ou
                // non.
                if (batons - nbBatonsJoueur <= 0) {

                    // Si on rentre dans ce bloc c'est que le joueur a pris le dernier bâton
                    // Dans ce cas on positionne fini à true
                    System.out.println("vous avez perdu");
                    fini = true;
                } else {

                    // Si on rentre dans ce bloc c'est que le joueur n'a pas pris le dernier bâton
                    // on soustrait donc simplement le nombre de bâtons pris par le joueur du
                    // total
                    batons = batons - nbBatonsJoueur;
                }

                // Si la partie n'est pas fini, alors c'est au tour du programme
                if (!fini) {

                    // L'astuce qui permet à l'ordinateur de ne jamais perdre est de prendre
                    // systématiquement
                    // un nombre de bâtons égal à 4-nbBatonsJoueur. Par exemple si la joueur a pris
                    // 3 bâtons alors l'ordinateur en prend 1 seul, etc.
                    int tmp = 4 - nbBatonsJoueur;

                    // On teste si l'ordinateur a saisi le dernier bâton ou non.
                    if (batons - tmp <= 0) {

                        // Si on entre dans ce bloc c'est que l'ordinateur a perdu.
                        // Normalement cela ne devrait pas se produire mais on écrit tout de même
                        // l'algorithme
                        // afin de faire un programme complet et éventuellement de pouvoir changer le
                        // calcul
                        // du nombre de bâtons tirés par l'ordinateur
                        System.out.println("l'IA à perdu");
                        fini = true;
                    } else {
                        // Si on rentre dans ce bloc c'est que la partie continue.
                        // on soustrait donc simplement le nombre de bâtons pris par l'ordinateur du
                        // total
                        batons = batons - tmp;
                        System.out.println("l'IA a pris " + tmp + " batons");
                    }
                }
            } else {
                // Si on rentre dans ce bloc, c'est que la saisie du joueur est incorrecte
                System.out.println("Saisie incorrecte");
            }

        }

        // Affichage de fin de programme
        System.out.println("Fin de programme");

        // Fermeture du scanner
        scan.close();
    }
}
