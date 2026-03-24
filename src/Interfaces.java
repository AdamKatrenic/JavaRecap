import java.util.ArrayList;

public class Interfaces {

    public static void main(String[] args) {

        Pes pes = new Pes();
        Macka macka = new Macka();

        ArrayList<HlasneZviera> zvierata = new ArrayList<>();
        zvierata.add(pes);
        zvierata.add(macka);

        for (HlasneZviera zviera : zvierata) {
            zviera.vydajZvuk();
        }
    }
}

interface HlasneZviera {
    public void vydajZvuk();
}

class Pes implements HlasneZviera {
    @Override
    public void vydajZvuk() {
        System.out.println("Hav hav abo daco take");
    }
}

class Macka implements HlasneZviera {
    @Override
    public void vydajZvuk() {
        System.out.println("Mnau abo daco take");
    }
}
