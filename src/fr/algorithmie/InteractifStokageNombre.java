package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStokageNombre {

    public static void main(String[] args) {

        System.out.println("Choix 1 : Ajouter un nombre\nChoix 2 : Afficher les nombres existants\nChoisissez une option entre 1 et 2 :" );

        Scanner scanner = new Scanner(System.in);
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
        }




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

    }
}
