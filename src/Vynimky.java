import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Vynimky {

    public static void main(String[] args) {
        double cislo1 = 10;
        double cislo2 = 0; // Tu je náš problém!

        try {
            double vysledok = rozdelCisla(cislo1, cislo2);
            System.out.println("Výsledok: " + vysledok);
        }
        catch (ArithmeticException e) {
            System.err.println("Chyba v programe! Zapisujem do logu...");
            zapisChybuDoSuboru(e.getMessage());
        }
        finally {
            System.out.println("Pokus o výpočet ukončený.");
        }
    }

    public static double rozdelCisla(double a, double b) {
        if (b == 0) {
            // Sami vyhodíme výnimku, ak niekto skúša deliť nulou
            throw new ArithmeticException("Pokus o delenie nulou číslom: " + a);
        }
        return a / b;
    }

    public static void zapisChybuDoSuboru(String sprava) {
        // Používame try-with-resources (automaticky zavrie súbor)
        try (FileWriter fw = new FileWriter("chyby.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println(LocalDateTime.now() + " - CHYBA: " + sprava);
            System.out.println("Chyba bola úspešne zapísaná do chyby.txt");

        } catch (IOException e) {
            System.err.println("Nepodarilo sa zapísať do súboru: " + e.getMessage());
        }
    }
}