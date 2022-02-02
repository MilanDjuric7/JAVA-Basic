package domaci_SlobodnaNedelja.postebin;

import java.util.Scanner;

public class Postebin1 {
    public static void main(String[] args) {

        // 1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.

        System.out.println("\nUnesite broj: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Uneti broj je Paran");
        } else if (n % 2 != 0) {
            System.out.println("Uneti broj je Neparan");
        }
        System.out.println("\n*** Kraj programa ***");
    }
}
