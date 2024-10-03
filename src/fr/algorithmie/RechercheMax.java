package fr.algorithmie;

public class RechercheMax {

    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int MaxValue = array[0];

        /*Rechercher le plus grand élément du tableau*/
        for (int i=0; i<array.length; i++) {
            if (array[i] > MaxValue) {
                MaxValue = array[i];
            }
        }

    }
}
