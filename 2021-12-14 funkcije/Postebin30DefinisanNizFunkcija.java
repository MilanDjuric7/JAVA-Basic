package domaci_14_12_2021;

public class Postebin30DefinisanNizFunkcija {
    public static void main(String[] args) {

        System.out.println("\nClanovi niza su: ");
        int[] niz = {2, 5, 7, 9, 15};

        for (int i = 0; i < niz.length; i++) {
            System.out.println((i + 1) + ". clan niza je: " + niz[i]);
        }

        proizvod(niz);

        System.out.println("\n*** Kraj programa ***");
    }

    public static void proizvod(int niz[]) {

        int proiz = 1;

        System.out.println("\nProizvod elemenata tog niza je: ");

        for (int i = 0; i < niz.length; i++) {
            proiz = proiz * niz[i];
        }

        System.out.println(proiz);

    }
}
