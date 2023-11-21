import java.math.BigDecimal;

public class Zbozi {
    private String popis;
    private BigDecimal cena;
    private  int pocetKusu;
    private boolean MaSnizenouDph = false;

    public Zbozi(String popis, BigDecimal cena, int pocetKusu, boolean maSnizenouDph) {
        this.popis = popis;
        this.cena = cena;
        this.pocetKusu = pocetKusu;
        MaSnizenouDph = maSnizenouDph;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public int getPocetKusu() {
        return pocetKusu;
    }

    public void setPocetKusu(int pocetKusu) {
        this.pocetKusu = pocetKusu;
    }

    public boolean isMaSnizenouDph() {
        return MaSnizenouDph;
    }

    public void setMaSnizenouDph(boolean maSnizenouDph) {
        MaSnizenouDph = maSnizenouDph;
    }
}
