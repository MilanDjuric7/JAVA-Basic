package domaci_03_12_2021;

import java.util.Scanner;

public class AritmetickeOperacije {
    public static void main(String[] args) {

        // Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim
        // redovima zbir, razliku, proizvod, kolicnik i ostatak deljenja prvog broja drugim
        // tim redom.

        Scanner sc = new Scanner(System.in);

        System.out.println("\nUnesite prvi broj: ");
        int x = sc.nextInt();

        System.out.println("Unesite drugi broj:  ");
        int y = sc.nextInt();

        System.out.println("Rezultati svih aritmetickih operacija ova dva uneta broja su: ");

        int z = x + y;
        System.out.println("\nZbir: " + z);

        int r  = x - y;
        System.out.println("Razlika: " + r);

        int p = x * y;
        System.out.println("Proizvod: " + p);

        int k = x / y;
        System.out.println("Kolicnik: " + k);

        int m = x % y;
        System.out.println("Ostatak deljenja: " + m);

        System.out.println("\n*** Kraj programa ***");
    }
}