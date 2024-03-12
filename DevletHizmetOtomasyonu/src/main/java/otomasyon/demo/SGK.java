package otomasyon.demo;

public class SGK {
    private String sigorta_kolu,sigorta_statusu,donem,ad,soyad;

    public SGK(String sigorta_kolu, String sigorta_statusu, String donem,String ad,String soyad) {

        this.sigorta_kolu = sigorta_kolu;
        this.sigorta_statusu = sigorta_statusu;
        this.donem = donem;
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getSigorta_kolu() {
        return sigorta_kolu;
    }

    public String getSigorta_statusu() {
        return sigorta_statusu;
    }

    public String getDonem() {
        return donem;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }
}
