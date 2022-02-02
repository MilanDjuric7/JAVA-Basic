package domaci_14_12_2021;

import java.util.Scanner;

public class Postebin27 {
    public static void main(String[] args) {

        // 27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
        // Ispisati svaki drugi element tog niza
        // Primer: [1, 2, 3, 4, 5] -> 1 3 5
        // 27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.

        Scanner sc = new Scanner(System.in);

        System.out.println("\nUnesite broj clanova niza: ");
        int[] niz = new int[sc.nextInt()];

        System.out.println("\nUnesite clanove niza: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }
        System.out.println("Svaki drugi clan niza je: ");
        for (int i = 0; i < niz.length; i+=2) {
            if (i != niz.length - 1) {
                System.out.print(niz[i] + ", ");
            }
            else {
                System.out.println(niz[i] + ".");
            }
        }

        System.out.println("\n*** Kraj programa ***");
    }
}
