package EZ;

public class EvidenciaZamestnancov {

    public static void main(String[] args) {

        Zamestnanec Adam = new Zamestnanec("Adam", "programator", 3000);
        Adam.vypisInfo();

        Manazer Lea = new Manazer("Lea", "Doktor", 7000, 500);
        Lea.vypisInfo();

        Zamestnanec Durko = new Zamestnanec("Durko", "zametač",1000);

        Firma firma = new Firma();

        firma.pridajZamestnanca(Adam);
        firma.pridajZamestnanca(Lea);

        firma.vypisVsetkych();
        firma.vypisBohatych();
    }
}

