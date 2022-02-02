package domaci_03_12_2021;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // Za uneti celobrojni nenegativan broj i, ispisati za sve brojeve od 1 do i
        // zakljucno sa i nisku "Fizz" ako je on deljiv sa 3, nisku "Buzz" ako je on deljiv sa 5,
        // a nisku "FizzBuzz" ako je on deljiv i sa 3 i sa 5.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo nenegativan broj: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Morate uneti ceo nenegativan broj:  ");
            n = sc.nextInt();
        }
        System.out.println("Vasa niska je: ");

        int deljenje = 0;

        for (int i = 1; i<=n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
               deljenje = deljenje + i;
               System.out.println(i + ": FizzBuzz");
            }
            else if (i % 3 == 0) {
                deljenje = deljenje + i;
                System.out.println(i + ": Fizz");
            }
            else if (i % 5 == 0) {
                deljenje = deljenje + i;
                System.out.println(i + ": Buzz");
            }
            else if (i % 3 != 0 || i % 5 != 0) {
                deljenje = deljenje + i;
                System.out.println(i + ": ");
            }
        }
        System.out.println("\n*** Kraj programa ***");
    }
}