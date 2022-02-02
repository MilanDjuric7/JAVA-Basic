package domaci_17_12_2021;

import java.util.Scanner;

public class Postebin42 {
    public static void main(String[] args) {

        // 42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

        Scanner sc = new Scanner(System.in);

        System.out.println("\nUnesite broj clanova niza: ");
        String[] niz = new String[sc.nextInt()];

        System.out.println("\nUnesite clanove niza: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi " + (i + 1) + ". clan niza: ");
            niz[i] = sc.next();

        }

        System.out.println("\nDa li u nizu niski imena postoji 'Marija' ili 'Petar': " + postojiLiIme(niz) + "!");

        System.out.println("\n*** Kraj programa ***");
    }
    public static boolean postojiLiIme(String[] xyz) {

        for (int i = 0; i < xyz.length; i++) {
            if (xyz[i].equals("Marija") || xyz[i].equals("Petar")) {
                return true;
            }

        }
        return false;
    }
}
