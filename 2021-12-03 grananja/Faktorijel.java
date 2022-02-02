package domaci_03_12_2021;

import java.util.Scanner;

public class Faktorijel {
    public static void main(String[] args) {

        // Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
        // Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao:
        // n! = n * (n-1) * (n-2) * ... * 2 * 1.
        // Dakle, npr:
        // 5! = 5 * 4 * 3 * 2 * 1 = 120
        // 3! = 3 * 2 * 1 = 6

        Scanner sc = new Scanner(System.in);
        System.out.println("\nUnesite pozitivan ceo broj: ");
        int n = sc.nextInt();

        while (n <= 0) {
                System.out.println("Morate uneti pozitivan ceo broj:  ");
                n = sc.nextInt();
            }
        int faktorijel = 1;

        for (int i = 1; i <= n; i++) {
                faktorijel = faktorijel * i;
            }
        System.out.println("Faktorijel broja " + n + " je: " + faktorijel
                + "\nOdnosno: " + n + "! = " + faktorijel);

        System.out.println("\n*** Kraj programa ***");
    }
}