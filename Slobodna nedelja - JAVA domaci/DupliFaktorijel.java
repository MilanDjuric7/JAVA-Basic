package domaci_SlobodnaNedelja;

import java.util.Scanner;

public class DupliFaktorijel {
    public static void main(String[] args) {

        /*
        1.[Dupli dupliFaktorijel] Napisati program koji racuna dupli Faktorijel unetog broja n.
        Dupli dupliFaktorijel broja n je:
        n!! = n * (n-2) * (n-4) * ... * (2 ili 1)
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("\nUnesite broj: ");
        int n = sc.nextInt();

        int dupliFaktorijel = 1;

        for (int i = n; i >= 1 ; i-=2) {
            dupliFaktorijel *= i;
        }

        /*
        if (n % 2 == 0){
            for (int i = n; i >= 2; i -= 2) {
              dupliFaktorijel = dupliFaktorijel * i;
            }
        }
        else{
            for(int i = n; i >= 1; i -= 2) {
                dupliFaktorijel = dupliFaktorijel * i;
            }
        }
        */
        System.out.println("Dupli faktorijel broja " + n + " je: " + dupliFaktorijel
                + "\nOdnosno: " + n + "!! = " + dupliFaktorijel);

        System.out.println("\n*** Kraj programa ***");
    }
}
