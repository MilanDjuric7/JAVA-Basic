package domaci_SlobodnaNedelja.postebin;

import java.util.Scanner;

public class Postebin3 {
    public static void main(String[] args) {

        // 3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.

        System.out.println("\nUnesite pozitivan ceo broj: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Morate uneti pozitivan ceo broj! Unesite broj ponovo:  ");
            n = sc.nextInt();
        }

        System.out.println("Svi brojevi od 0 do " + n + " (zakljucno sa njima) su: ");
        for (int i = 0; i <= n; i++ ) {
            System.out.println(i);
        }
        System.out.println("\n*** Kraj programa ***");
    }
}
