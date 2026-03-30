package Kniha;

public class Kniha {

    String nazov;
    String autor;
    int rokVydania;
    boolean jeDostupna = true;

    public Kniha(String nazov, String autor, int rokVydania) {
        this.nazov = nazov;
        this.autor = autor;
        this.rokVydania = rokVydania;
    }

    public String getNazov() {
        return nazov;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public boolean isJeDostupna() {
        return jeDostupna;
    }

    public void vypisInfo() {
        System.out.println("Názov : " + getNazov() + ", Autor: " + getAutor() + ", Rok Vydania: " + getRokVydania());
    }
}
