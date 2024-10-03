package fr.algorithmie;

public class Rotation {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3};
        int last = array[array.length - 1];

        /*Rotation à droite des éléments*/
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }

        array[0] = last;

    }
}
