package domaci_SlobodnaNedelja.postebin;

import java.util.Scanner;

public class Postebin8 {
    public static void main(String[] args) {

        // 8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
        //
        // "Dobrodosao u {x}. razred, {ime} {prezime}",
        //
        // pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda.
        // A ako korisnik nije djak ispisati jednu odgovarajucu poruku od:
        //
        // "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"

        System.out.println("\nUnesite ime: ");
        Scanner sc = new Scanner(System.in);
        String ime = sc.next();

        System.out.println("Unesite prezime: ");
        String prezime = sc.next();

        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = sc.nextInt();

        int trenutnoGodina = 2021 - godinaRodjenja;
        int razred = trenutnoGodina - 6;

        if (trenutnoGodina < 7) {
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje");
        }
        else if (trenutnoGodina > 18) {
            System.out.println(ime + " " +  prezime + " je zavrsio/la skolu");
        }
        else {
            System.out.println("Dobrodosao/la u " + razred + ". razred, " + ime + " " + prezime + ".");
        }

        System.out.println("\n*** Kraj programa ***");
    }
}
