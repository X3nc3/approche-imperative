package fr.algorithmie;

public class FirstLast6 {

    public static void main(String[] args) {

        /*Test si au moins 1 élément dans le tableau mais ne commence pas ni ne fini pas par 6*/
        int[] array = {5};
        /*Test si au moins 1 élément dans le tableau, ne commence pas par 6 mais fini pas par 6*/
        /*int[] array = {1, 6};*/
        /*Test si au moins 1 élément dans le tableau, commence par 6 mais fini pas par 6*/
        /*int[] array = {6, 1};*/

        /*boolean firstLast6;

        if (array[0] == 6) {
            firstLast6 = true;
        } else if (array[array.length-1] == 6) {
            firstLast6 = true;
        } else {
            firstLast6 = false;
        }
        System.out.println(firstLast6);*/

        boolean firstLast6 = array.length >= 1 && (array[0] == 6 || array[array.length - 1] == 6);

        System.out.println(firstLast6);

    }
}
