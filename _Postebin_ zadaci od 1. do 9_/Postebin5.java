package domaci_SlobodnaNedelja.postebin;

import java.util.Scanner;

public class Postebin5 {
    public static void main(String[] args) {

        // 5. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n

        System.out.println("\nUnesite pozitivan ceo broj: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Morate uneti pozitivan ceo broj. Unesite broj ponovo:  ");
            n = sc.nextInt();
        }

        System.out.println("Svi brojevi od -14 do " + 2*n + " (zakljucno sa njima) su: ");
        for (int i = -14; i <= 2*n ; i++) {
            System.out.println(i);
        }
        System.out.println("\n*** Kraj programa ***");
    }
}
