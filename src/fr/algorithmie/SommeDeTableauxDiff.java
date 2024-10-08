package fr.algorithmie;

public class SommeDeTableauxDiff {

    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        /*Crée un tableau qui contient la somme des 2 précédents tableaux*/
        /*int[] array3 = new int[array1.length];

        for (int i=0; i<array2.length; i++) {
            array3[i] = array1[i] + array2[i];
            for (int j=8; j<17; j++) {
                array3[j] = array1[j];
            }
        }*/

        int[] array3;

        if (array1.length >= array2.length) {
            array3 = new int[array1.length];

            for (int i = 0; i < array1.length; i++) {

                // On ne fait la somme que jusqu'à l'index max du tableau 2
                if (i < array2.length) {
                    array3[i] = array1[i] + array2[i];
                } else {
                    array3[i] = array1[i];
                }
                System.out.print(array3[i] + " ");
            }
        } else {
            array3 = new int[array2.length];

            for (int i = 0; i < array2.length; i++) {

                // On ne fait la somme que jusqu'à l'index max du tableau 1
                if (i < array1.length) {
                    array3[i] = array1[i] + array2[i];
                } else {
                    array3[i] = array2[i];
                }
                System.out.print(array3[i] + " ");
            }
        }

    }
}
