package domaci_SlobodnaNedelja.postebin;

import java.util.Scanner;

public class Postebin7Switch {
    public static void main(String[] args) {

        // 7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

        System.out.println("\nUnesite mesec u kojem Ste rodjeni: ");
        Scanner sc = new Scanner(System.in);
        String mesec = sc.next();

        System.out.println("Unesite datum kada Ste rodjeni: ");
        int dan = sc.nextInt();

        String horoskopskiZnak = "";

        switch (mesec) {                                  // Jarac – od 22. decembra do 20. januara;
            case "januar":                                // Vodolija – od 21. januara do 19. februara;

                while (dan <= 0 || dan > 31) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 20) {
                    horoskopskiZnak = "Jarac";
                }
                else {
                    horoskopskiZnak = "Vodolija";
                }
                break;

            case "februar":                                  // Ribe – od 20. februara do 20. marta;

                while (dan <= 0 || dan > 29) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 19) {
                    horoskopskiZnak = "Vodolija";
                }
                else {
                    horoskopskiZnak = "Ribe";
                }
                break;

            case "mart":                                    // Ovan – od 21. marta do 20. aprila;

                while (dan <= 0 || dan > 31) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 20) {
                    horoskopskiZnak = "Ribe";
                }
                else {
                    horoskopskiZnak = "Ovan";
                }
                break;

            case "april":                                    // Bik – od 21. aprila do 21. maja;

                while (dan <= 0 || dan > 30) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 20) {
                    horoskopskiZnak = "Ovan";
                }
                else {
                    horoskopskiZnak = "Bik";
                }
                break;

            case "maj":                                     // Blizanci – od 22. maja do 21. juna;

                while (dan <= 0 || dan > 31) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 21) {
                    horoskopskiZnak = "Bik";
                }
                else {
                    horoskopskiZnak = "Blizanci";
                }
                break;

            case "jun":                                     // Rak – od 22. juna do 22. jula;

                while (dan <= 0 || dan > 30) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 21) {
                    horoskopskiZnak = "Blizanci";
                }
                else {
                    horoskopskiZnak = "Rak";
                }
                break;

            case "jul":                                      // Lav – od 23. jula do 22. avgusta;

                while (dan <= 0 || dan > 31) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 22) {
                    horoskopskiZnak = "Rak";
                }
                else {
                    horoskopskiZnak = "Lav";
                }
                break;

            case "avgust":                                 // Devica – od 23. avgusta do 22. septembra;

                while (dan <= 0 || dan > 31) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 22) {
                    horoskopskiZnak = "Lav";
                }
                else {
                    horoskopskiZnak = "Devica";
                }
                break;

            case "septembar":                               // Vaga – od 23. septembra do 23.oktobra;

                while (dan <= 0 || dan > 30) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 22) {
                    horoskopskiZnak = "Devica";
                }
                else {
                    horoskopskiZnak = "Vaga";
                }
                break;

            case "oktobar":                              // Škorpija – od 24. oktobra do 22. novembra;

                while (dan <= 0 || dan > 31) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 23) {
                    horoskopskiZnak = "Vaga";
                }
                else {
                    horoskopskiZnak = "Skorpija";
                }
                break;

            case "novembar":                              // Strelac – od 23. novembra do 21. decembra;

                while (dan <= 0 || dan > 31) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 24) {
                    horoskopskiZnak = "Skorpija";
                }
                else {
                    horoskopskiZnak = "Strelac";
                }
                break;

            case "decembar":                                  // Jarac – od 22. decembra do 20. januara;

                while (dan <= 0 || dan > 31) {
                    System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                    dan = sc.nextInt();
                }

                if (dan <= 23) {
                    horoskopskiZnak = "Strelac";
                } else {
                    horoskopskiZnak = "Jarac";
                }
                break;

            default:
                System.out.println("Uneli Ste neodgovarajuce podatke za mesec rodjenja.");
                break;
        }
        System.out.println("U horoskopu Ste: " + horoskopskiZnak + ".");

        System.out.println("\n*** Kraj programa ***");
    }
}
