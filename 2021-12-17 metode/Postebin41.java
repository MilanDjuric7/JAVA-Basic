package domaci_17_12_2021;

import java.util.Scanner;

public class Postebin41 {
    public static void main(String[] args) {

        // 41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

        Scanner sc = new Scanner(System.in);

        System.out.println("\nUnesite broj clanova niza: ");
        double[] niz = new double[sc.nextInt()];

        System.out.println("\nUnesite clanove niza: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextDouble();
        }

        System.out.println("\nProsecna vrednost unetog niza je: " + (prosecnaVrednost(niz)));

        System.out.println("\n*** Kraj programa ***");

    }
    public static double prosecnaVrednost(double[] xyz) {
        
        double suma = 0;

        for (int i = 0; i < xyz.length; i++) {
            suma = suma + xyz[i];
            
        }

        double prosek = suma / xyz.length;

        return  prosek;
    }
}
