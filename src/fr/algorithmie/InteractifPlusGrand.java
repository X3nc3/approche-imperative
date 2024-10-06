package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb;
        int maxNb = -1000000000;

        for (int i=1; i<=10; i++) {
            System.out.println("Choisissez le nombre " + i + " :");
            nb = scanner.nextInt();
            if (nb > maxNb) {
                maxNb = nb;
            }
        }

        System.out.println("Le nombre le plus grand est : " + maxNb);
    }
}
