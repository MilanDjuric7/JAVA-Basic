package domaci_14_12_2021;

import java.util.Scanner;

public class Postebin31 {
    public static void main(String[] args) {

        // 31. Napisati funkciju koja racuna proizvod 3 broja.
        // Hint kako citati ove zadatke:
        // - ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
        // - funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)

        Scanner sc = new Scanner(System.in);

        System.out.println("\nUnesiti tri broja: ");

        System.out.println("Prvi broj: ");
        int prvi = sc.nextInt();

        System.out.println("Drugi broj: ");
        int drugi = sc.nextInt();

        System.out.println("Treci broj: ");
        int treci = sc.nextInt();

        System.out.println("\nProizvod ova tri broja je: ");

        System.out.println(proizvodMetoda(prvi, drugi, treci));

        System.out.println("\n*** Kraj programa ***");

    }
    public static int proizvodMetoda(int prvi, int drugi, int treci) {

        int proizvod = prvi * drugi * treci;

        return proizvod;
    }
}
