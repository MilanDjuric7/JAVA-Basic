package domaci_SlobodnaNedelja.postebin;

import java.util.Scanner;

public class Postebin2 {
    public static void main(String[] args) {

        // 2. Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0,
        // "Negativan" ako je strogo manji od 0 ili "Neutralan" ako je tacno 0.

        System.out.println("\nUnesite broj: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Uneti broj je Pozitivan");
        } else if (n < 0) {
            System.out.println("Uneti broj je Negativan");
        } else if (n == 0) {
            System.out.println("Uneti broj je Neutralan");
        }
        System.out.println("\n*** Kraj programa ***");
    }
}
