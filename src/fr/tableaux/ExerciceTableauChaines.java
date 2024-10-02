package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] array = {"Paris", "Lyon", "Nice", "Marseille", "Nantes"};

            System.out.println(array[0]);
            System.out.println(array[1]);
            System.out.println(array[2]);
            System.out.println(array[3]);
            System.out.println(array[4]);

            System.out.println(array.length);

        array[3] = "Reims";

            for (int i=0; i<array.length; i++) {
                System.out.println(array[i]);
            }
    }
}
