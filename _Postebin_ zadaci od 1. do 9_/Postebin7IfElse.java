package domaci_SlobodnaNedelja.postebin;

import java.util.Scanner;

public class Postebin7IfElse {
    public static void main(String[] args) {

        // 7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

        System.out.println("\nUnesite mesec u kojem Ste rodjeni: ");
        Scanner sc = new Scanner(System.in);
        String mesec = sc.next();

        System.out.println("Unesite datum kada Ste rodjeni: ");
        int dan = sc.nextInt();

        String horoskopskiZnak = "";

        if (mesec.equals("januar")) {                     // Jarac – od 22. decembra do 20. januara;
                                                          // Vodolija – od 21. januara do 19. februara;
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
        }

        else if (mesec.equals("februar")) {                    // Ribe – od 20. februara do 20. marta;

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
        }

        else if (mesec.equals("mart")) {                        // Ovan – od 21. marta do 20. aprila;

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
        }

        else if(mesec.equals("april")) {                          // Bik – od 21. aprila do 21. maja;

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
        }

        else if (mesec.equals("maj")) {                          // Blizanci – od 22. maja do 21. juna;

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
        }

        else if (mesec.equals("jun")) {                             // Rak – od 22. juna do 22. jula;

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
        }

        else if(mesec.equals("jul")) {                             // Lav – od 23. jula do 22. avgusta;

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
        }

        else if (mesec.equals("avgust")) {                 // Devica – od 23. avgusta do 22. septembra;

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
        }

        else if(mesec.equals("septembar")) {                 // Vaga – od 23. septembra do 23.oktobra;

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
        }

        else if (mesec.equals("oktobar")) {               // Škorpija – od 24. oktobra do 22. novembra;

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
        }

        else if (mesec.equals("novembar")) {              // Strelac – od 23. novembra do 21. decembra;

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
        }

        else if (mesec.equals("decembar")) {                 // Jarac – od 22. decembra do 20. januara;

            while (dan <= 0 || dan > 31) {
                System.out.println("Uneli ste nepostojeci datum! Unesite ponovo datum: ");
                dan = sc.nextInt();
            }

            if (dan <= 23) {
                horoskopskiZnak = "Strelac";
            } else {
                horoskopskiZnak = "Jarac";
            }
        }
        else {
            System.out.println("Uneli Ste neodgovarajuce podatke za mesec rodjenja.");
        }
        System.out.println("U horoskopu ste " + horoskopskiZnak + ".");

        System.out.println("\n*** Kraj programa ***");
    }
}
