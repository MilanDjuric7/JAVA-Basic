package domaci_SlobodnaNedelja;

import java.util.Scanner;

public class SumaIntervala {
    public static void main(String[] args) {

        // 2.[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n.
        // Ispisati sumu brojeva [m, n].

        Scanner sc = new Scanner(System.in);
        System.out.println("\nUnesi vrednost celog broja 'm': ");
        int m = sc.nextInt();
        System.out.println("'m' MORA biti <= od 'n'!!!");
        System.out.println("Unesi vrednost celog broja 'n': ");
        int n = sc.nextInt();

        while (n < m) {
            System.out.println("Morate uneti broj koji je veci ili jednak broju " + m +
                    "!\nUnesite novu vrednost broju 'n': ");
            n = sc.nextInt();
        }

        int suma = 0;
        for (int i = m; i <= n ; i++) {
            suma += i;
        }
        System.out.println("\nSuma brojeva od " + m + " do " + n + " je: " + suma);

        System.out.println("\n*** Kraj programa ***");
    }
}
