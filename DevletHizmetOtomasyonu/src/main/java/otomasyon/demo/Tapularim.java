package otomasyon.demo;

public class Tapularim {
    private String il,ilce,mahalle,adres,tasinmaz_tipi,nitelik;

    public Tapularim(String il, String ilce, String mahalle, String adres, String tasinmaz_tipi, String nitelik) {

        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.adres = adres;
        this.tasinmaz_tipi = tasinmaz_tipi;
        this.nitelik = nitelik;
    }

    public String getIl() {
        return il;
    }

    public String getIlce() {
        return ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public String getAdres() {
        return adres;
    }

    public String getTasinmaz_tipi() {
        return tasinmaz_tipi;
    }

    public String getNitelik() {
        return nitelik;
    }
}
