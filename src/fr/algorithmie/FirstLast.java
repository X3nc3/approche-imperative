package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {

        /*Test si au moins 1 élément dans le tableau et que le premier élément et le dernier ont la meme valeur*/
        int[] array = {5};
        /*Test si au moins 1 élément dans le tableau et que le premier élément et le dernier ont la meme valeur*/
        /*int[] array = {5, 5};*/
        /*Test si au moins 1 élément dans le tableau et que le premier élément et le dernier n'ont pas la meme valeur*/
        /*int[] array = {5, 6};*/

        /*boolean firstLast6;

        if (array[0] == array[array.length-1]) {
            firstLast6 = true;
        } else {
            firstLast6 = false;
        }
        System.out.println(firstLast6);*/

        boolean firstLast = array.length >= 1 && array[0] == array[array.length - 1];

        System.out.println(firstLast);

    }
}
