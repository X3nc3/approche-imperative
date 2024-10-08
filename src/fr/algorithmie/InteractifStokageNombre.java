package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStokageNombre {

    public static void main(String[] args) {

        System.out.println("Choix 1 : Ajouter un nombre\nChoix 2 : Afficher les nombres existants\nChoisissez une option entre 1 et 2 :" );

        /*Scanner scanner = new Scanner(System.in);
        int numChoix = scanner.nextInt();

        int[] array = new int[1];

        switch (numChoix) {
            case 1 : System.out.println("choisissez un nombre à ajouter au tableau :");
                Scanner scanner2 = new Scanner(System.in);
                int nb = scanner.nextInt();
                array[0] = nb;
                array = Arrays.copyOf(array, array.length+1);
                System.out.println("Choisissez une option entre 1 et 2 :" );
                Scanner scanner4 = new Scanner(System.in);
                numChoix = scanner.nextInt();
                break;
            case 2 : for (int i=0; i<array.length; i++) {
                System.out.println(array[i]);
            }
                break;
            default : System.out.println("Choisissez une option entre 1 et 2 :");
                Scanner scanner3 = new Scanner(System.in);
                numChoix = scanner.nextInt();
        }*/

                /*if (numChoix == 1) {
                System.out.println("choisissez un nombre à ajouter au tableau :");
                Scanner scanner2 = new Scanner(System.in);
                int nb = scanner.nextInt();
                array[0] = nb;
                array = Arrays.copyOf(array, array.length+1);
                System.out.println("Choisissez une option entre 1 et 2 :" );
                Scanner scanner4 = new Scanner(System.in);
                numChoix = scanner.nextInt();
            } else if (numChoix == 2) {
                for (int i=0; i<array.length; i++) {
                    System.out.println(array[i]);
                }
            } else {
                System.out.println("Choisissez une option entre 1 et 2 :");
                Scanner scanner3 = new Scanner(System.in);
                numChoix = scanner.nextInt();
            }*/

        // On initialise le scanner qui va nous servir à interagir avec l'utilisateur
        Scanner scan = new Scanner(System.in);

        // On initialise un tableau de longueur 0
        int[] tab = new int[0];

        // On initialise notre condition de fin de programme
        boolean sortie = false;

        // Tant que la sortie n'a pas été décidée par l'utilisateur on continue la
        // boucle
        while (!sortie) {

            // On affiche les options du programme à l'utilisateur
            System.out.println("Options:");
            System.out.println("1 - Pour saisir une valeur");
            System.out.println("2 - Pour afficher les valeurs saisies");
            System.out.println("3 - Pour quitter le programme.");

            // On enregistre sa saisie dans menu
            int menu = scan.nextInt();

            // On teste la valeur de cmd
            switch (menu) {
                // Si la valeur est 1
                case 1:

                    // On demande à l'utilisateur de saisir une valeur
                    System.out.println("Saisissez une valeur");
                    int valeur = scan.nextInt();

                    // On va devoir créer un tableau temporaire plus grand d'une case que le tableau
                    // précédent
                    int[] tmp = new int[tab.length + 1];

                    // On stocke toutes les valeurs du tableau précédent dans le nouveau tableau
                    for (int i = 0; i < tmp.length - 1 && tab.length > 0; i++) {
                        tmp[i] = tab[i];
                    }

                    // Puis en fin de tableau (case complémentaire), on stocke la valeur saisie
                    tmp[tmp.length - 1] = valeur;

                    // On affecte enfin le tableau tmp au tableau tab
                    tab = tmp;
                    break;
                case 2:

                    // On affiche toutes les valeurs stockées dans le tableau tab
                    for (int i = 0; i < tab.length; i++) {
                        System.out.print(tab[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:

                    // On positionne sortie à true
                    sortie = true;
                    break;
                default:

                    // On ne fait rien dans tous les autres cas
                    break;
            }
        }

        // On ferme le scanner
        scan.close();
    }
}
