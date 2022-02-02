package domaci_14_12_2021;

import java.util.Scanner;

public class Postebin30Scanner {
    public static void main(String[] args) {

        // 30. Izracunati proizvod elemenata tog niza.
        // Primer: [2, 4] -> 8
        // 30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.

        Scanner sc = new Scanner(System.in);

        System.out.println("\nUnesite broj clanova niza: ");
        int[] niz = new int[sc.nextInt()];

        System.out.println("\nUnesite clanove niza: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }

        int proizvod = 1;
        System.out.println("Proizvod elemenata tog niza je: ");
        for (int i = 1; i < niz.length; i++) {
            proizvod = proizvod * niz[i];
        }

        System.out.println(proizvod);

        System.out.println("\n*** Kraj programa ***");
    }
}
