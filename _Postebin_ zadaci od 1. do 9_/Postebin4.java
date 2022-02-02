package domaci_SlobodnaNedelja.postebin;

import java.util.Scanner;

public class Postebin4 {
    public static void main(String[] args) {

        // 4. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.

        System.out.println("\nUnesite negativan ceo broj: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n >= 0) {
            System.out.println("Morate uneti negativan ceo broj! Unesite broj ponovo:  ");
            n = sc.nextInt();
        }

        System.out.println("Svi brojevi od " + n + " do 0 (zakljucno sa njima) su: ");
        for (int i = n; i <= 0 ; i++) {
            System.out.println(i);
        }
        System.out.println("\n*** Kraj programa ***");
    }
}
