package EZ;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Firma {

    private ArrayList<Zamestnanec> zoznam = new ArrayList<>();

    public void pridajZamestnanca(Zamestnanec z) {
        zoznam.add(z);
    }

    public void vypisVsetkych() {
        System.out.println("--- Zoznam zamestnancov firmy ---");
        for (Zamestnanec z : zoznam) {
            z.vypisInfo();
        }
    }

    public void vypisBohatych() {
        System.out.println("--- Zoznam bohatých zamestnancov (Plat > 2000€) ---");

        zoznam.stream()
                .filter(z -> z.getPlat() > 2000) // 1. Odfiltrujeme len tých s platom nad 2000
                .forEach(z -> System.out.println(z.getMeno() + " (" + z.getPlat() + "€)")); // 2. Vypíšeme ich
    }
}