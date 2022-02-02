import java.util.Scanner;
public class Sintaksa1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double manji1;
        double manji2;
        System.out.print("Upišite dužinu visine zida 1 = ");
        manji1 = scanner.nextDouble();
        System.out.print("Upišite dužinu širine zida 1 = ");
        manji2 = scanner.nextDouble();
        double manji = manji1 * manji2;
        double veći1;
        double veći2;
        System.out.print("Upišite dužinu visine zida 2 = ");
        veći1 = scanner.nextDouble();
        System.out.print("Upišite dužinu širine zida 2 = ");
        veći2 = scanner.nextDouble();
        double veći = veći1 * veći2;
        double plafonDužina;
        double plafonŠirina;
        System.out.print("Upišite dužinu plafona = ");
        plafonDužina = scanner.nextDouble();
        System.out.print("Upišite širinu plafona = ");
        plafonŠirina = scanner.nextDouble();
        double plafon = plafonDužina * plafonŠirina;
        double prostorija = plafon + (manji * 2) + (veći * 2);
        System.out.print("Ukupna površina okrečene prostorije je = " + prostorija);
    }
}
