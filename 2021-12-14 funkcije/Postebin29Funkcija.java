package domaci_14_12_2021;

import java.util.Scanner;

public class Postebin29Funkcija {
    public static void main(String[] args) {

        // 29. Ispisati svaki treci element u obrnutom redosledu.
        // Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
        // 29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.

        Scanner sc = new Scanner(System.in);

        System.out.println("\nUnesite broj clanova niza: ");
        int[] niz = new int[sc.nextInt()];

        System.out.println("\nUnesite clanove niza: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }

        svakiTreciObrnuto(niz);

        System.out.println("\n*** Kraj programa ***");

    }

    public static void svakiTreciObrnuto(int[] niz) {

        System.out.println("\nSvaki treci element niza u obrnutom redosledu je: ");

        for (int j = niz.length - 1; j >= 0; j-=3) {
            System.out.println(niz[j]);
        }

    }
}
