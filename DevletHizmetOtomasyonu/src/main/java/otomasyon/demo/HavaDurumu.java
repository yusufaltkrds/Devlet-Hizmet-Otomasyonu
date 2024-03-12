package otomasyon.demo;

public class HavaDurumu {
    private String sehir,p_tesi,sali,carsamba,persembe,cuma;

    public HavaDurumu(String sehir) {
        this.sehir = sehir;
        this.p_tesi = "25°C Güneşli";
        this.sali = "15°C Yağmurlu";
        this.carsamba = "12°C Bulutlu";
        this.persembe = "10°C Sağanak Yağışlı";
        this.cuma = "-3°C Karlı";
    }

    public String getP_tesi() {
        return p_tesi;
    }

    public String getSali() {
        return sali;
    }

    public String getCarsamba() {
        return carsamba;
    }

    public String getPersembe() {
        return persembe;
    }

    public String getCuma() {
        return cuma;
    }

    public String getSehir() {
        return sehir;
    }
}
