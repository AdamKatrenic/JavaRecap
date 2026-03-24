package EZ;

public class Zamestnanec {
    
    private String meno;
    private String pozicia;
    private double plat;

    public Zamestnanec(String meno, String pozicia, double plat) {
        this.meno = meno;
        this.pozicia = pozicia;
        this.plat = plat;
    }

    public Zamestnanec() {
    }

    public String getMeno() {
        return meno;
    }

    public String getPozicia() {
        return pozicia;
    }

    public double getPlat() {
        return plat;
    }

    public void vypisInfo() {
        System.out.println(getMeno() + " je na pozícii " + getPozicia() + " s platom " + getPlat());
    }
}
