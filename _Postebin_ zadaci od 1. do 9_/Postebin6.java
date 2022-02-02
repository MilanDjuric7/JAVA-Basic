package domaci_SlobodnaNedelja.postebin;

import java.util.Scanner;

public class Postebin6 {
    public static void main(String[] args) {

        // 6. Ispisati proizvod prvih n celih brojeva [1, n].

        System.out.println("\nUnesite ceo broj: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int proizvod = 1;
        for ( int i = 1; i <= n ; i++) {
            proizvod = proizvod * i;
        }
        System.out.println("Proizvod celih brojeva od 1 do " + n + " je: " + proizvod);

        System.out.println("\n*** Kraj programa ***");
    }
}
