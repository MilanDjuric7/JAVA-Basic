package domaci_SlobodnaNedelja;

import java.util.Scanner;

public class NaizmenicnaSuma {
    public static void main(String[] args) {

        // 3.[Naizmenicna suma] Korisnik unosi vrednost broja n (int) sa konzole.
        // Na standardni izlaz ispisati resenje izraza:
        // 1 - 2 + 3 - .... (+/-) n.

        Scanner sc = new Scanner(System.in);
        System.out.println("\nUnesite vrednost broja 'n': ");
        int n = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= n ; i++) {
            if (i % 2 == 0){
                suma -= i;
            } else {
                suma += i;
            }
        }
        System.out.println("\nNaizmenicna suma brojeva od 1 do " + n + " je: " + suma);

        System.out.println("\n*** Kraj programa ***");
    }
}
