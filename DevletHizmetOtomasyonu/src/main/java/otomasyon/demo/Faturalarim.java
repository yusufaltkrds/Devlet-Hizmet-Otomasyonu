package otomasyon.demo;

public class Faturalarim {
    private String fatura_turu,abone_no,kesim_tarihi,tutar,ad,soyad;

    public Faturalarim( String fatura_turu, String abone_no, String kesim_tarihi, String tutar,String ad,String soyad) {

        this.fatura_turu = fatura_turu;
        this.abone_no = abone_no;
        this.kesim_tarihi = kesim_tarihi;
        this.tutar = tutar;
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getFatura_turu() {
        return fatura_turu;
    }

    public String getAbone_no() {
        return abone_no;
    }

    public String getKesim_tarihi() {
        return kesim_tarihi;
    }

    public String getTutar() {
        return tutar;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }
}
