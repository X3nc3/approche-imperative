package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb;
        int sommeNb = 0;

        System.out.println("Choisissez un nombre :");
        nb = scanner.nextInt();


        for (int i=0; i<nb; i++) {
            sommeNb += i + 1;
        }

        System.out.println("la somme de tous les entiers compris entre 1 et " + nb +" est :\n" + sommeNb);

    }
}
