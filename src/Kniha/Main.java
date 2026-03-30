package Kniha;

public class Main {

    public static void main(String[] args) {

        Kniha kniha1 = new Kniha("Kocurkovo", "Adam Katrenič", 1999);
        Kniha kniha2 = new Kniha("Pat A Mat", "Lea Voláková", 2001);
        Kniha kniha3 = new Kniha("Kacer Donald", "Niekto fak známy", 2015);

        Kniha[] knihy = new Kniha[3];

        // 1. Naplň pole (toto ti chýbalo)
        knihy[0] = kniha1;
        knihy[1] = kniha2;
        knihy[2] = kniha3;

        // 2. Prejdi pole cyklom
        for (int i = 0; i < knihy.length; i++) {
            // Zavolaj tvoju metódu
            knihy[i].vypisInfo();

            // 3. Bonusová úloha: skontroluj rok
            if (knihy[i].getRokVydania() < 2000) {
                System.out.println("   --> POZOR: Stará vzácna kniha!");
            }
        }
    }
}
