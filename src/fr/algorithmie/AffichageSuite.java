package fr.algorithmie;

public class AffichageSuite {

    public static void main(String[] args) {

        /*Utiliser une boucle for pour afficher tout les nombres de 1 à 10 inclus*/
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }

        /*Utiliser une boucle for pour afficher tout les nombres pairs enter 0 et 10 inclus*/
        for (int i=0; i<=10; i++) {
            if ( i%2 == 0 ) {
                System.out.println(i);
            }
        }

        /*Utiliser une boucle for pour afficher tout les nombres impairs enter 0 et 9 inclus*/
        for (int i=0; i<=10; i++) {
            if ( i%2 != 0 ) {
                System.out.println(i);
            }
        }

        /*Utiliser une boucle while pour afficher tout les nombres de 1 à 10 inclus*/
        int i = 1;
        while ( i <= 10 ) {
            System.out.println(i);
            i++;
        }

        /*Utiliser une boucle while pour afficher tout les nombres pairs enter 0 et 10 inclus*/
        i = 0;
        while ( i <= 10 ) {
            if ( i%2 == 0 ) {
                System.out.println(i);
            }
            i++;
        }

        /*Utiliser une boucle while pour afficher tout les nombres impairs enter 0 et 9 inclus*/
        i = 0;
        while ( i <= 10 ) {
            if ( i%2 != 0 ) {
                System.out.println(i);
            }
            i++;
        }

    }
}