package fr.algorithmie;

public class ComparaisonTableau {

    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        /*Compter le nombre d'éléments en commun dans les 2 tableaux*/
        int nombOccurence = 0;

        for (int i=0; i<array1.length; i++) {
            for (int j=0; j<array2.length; j++) {
                if (array1[i] == array2[j]) {
                    nombOccurence++;
                }
            }
        }

    }
}
