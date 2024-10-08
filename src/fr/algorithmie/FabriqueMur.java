package fr.algorithmie;

public class FabriqueMur {
    public static void main(String[] args) {

        // Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;

        // Si la longueur est supérieure à la longueur totale max qu'on peut produire
        // avec les briques dont on dispose alors le résultat est false
        // Par exemple, il est impossible de construire un mur de 50 mètres avec 1
        // brique de 5m et 1 brique de 1m.
        if (longueur > nbSmall + nbBig * 5) {
            resultat = false;
        } else {
            // Si nous avons assez de briques, il faut commencer par calculer le nombre
            // maximum de briques de 5m qu'on peut utiliser.
            // Par exemple, si on a une longueur de 9m à fabriquer et qu'on a 2 briques de
            // 5m, on ne pourra pas utiliser les 2 briques
            // mais seulement 1 seule.
            // Ce nombre max est calculé par la division entière de la longueur par 5
            // Dans ce cas, si par exemple la longueur est égale à 9 alors nbMaxBriquesBig
            // est égal à 1
            int nbMaxBriquesBig = longueur / 5;

            // Ensuite on calcule la longueur max qu'on peut produire avec ce nombre max:
            // Sur la base de notre exemple précédent, on obtient la valeur de 5 mètres
            int longueurMaxBig = nbMaxBriquesBig * 5;

            // On calcule alors la longueur restant à produire une fois les briques de 5m
            // utilisées
            int longueurRestante = longueur - longueurMaxBig;

            // Si le nombre de petites briques est supérieur ou égal à cette longueur alors
            // le résultat est true, sinon il est false

            resultat = nbSmall >= longueurRestante;
        }

        return resultat;
    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            throw new RuntimeException("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
        } else {
            System.out.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") passant.");
        }
    }
}
