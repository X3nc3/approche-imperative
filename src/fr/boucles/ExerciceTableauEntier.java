package fr.boucles;

public class ExerciceTableauEntier {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(array[0]);
        System.out.println(array.length);
        System.out.println(array[array.length-1]);

        array[4] = 8;

        System.out.println(array[4]);

    }


}
