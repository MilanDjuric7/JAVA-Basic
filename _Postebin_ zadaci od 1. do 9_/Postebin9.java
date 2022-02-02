package domaci_SlobodnaNedelja.postebin;

import java.util.Scanner;

public class Postebin9 {
    public static void main(String[] args) {

        // 9. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
        // "Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7
        // i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)

        System.out.println("\nUnesite ceo broj 'n': ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Morate uneti pozitivan ceo broj. Unesite broj ponovo:  ");
            n = sc.nextInt();
        }

        for(int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println(i + " FizzBuzzZazz");
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            }
            else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i + " FizzZazz");
            }
            else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i + " BuzzZazz");
            }
            else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
            else if (i % 7 == 0) {
                System.out.println(i + " Zazz");
            }
            else
                System.out.println(i + "  ");
        }

        System.out.println("\n*** Kraj programa ***");
    }
}
