package EZ;

public class Manazer extends Zamestnanec{

    private double bonus;

    public Manazer(String meno, String pozicia, double plat, double bonus) {
        super(meno, pozicia, plat);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void vypisInfo() {
        System.out.println(getMeno() + " je na pozícii " + getPozicia() + " s platom " + getPlat() + " a bonusom " + getBonus());
    }
}
