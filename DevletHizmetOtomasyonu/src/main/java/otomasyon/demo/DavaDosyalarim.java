package otomasyon.demo;

public class DavaDosyalarim {
    private String adli_birim,acilis_tarihi,dosya_turu,taraf_rolu;

    public DavaDosyalarim(String adli_birim, String acilis_tarihi, String dosya_turu, String taraf_rolu) {

        this.adli_birim = adli_birim;
        this.acilis_tarihi = acilis_tarihi;
        this.dosya_turu = dosya_turu;
        this.taraf_rolu = taraf_rolu;
    }

    public String getAdli_birim() {
        return adli_birim;
    }

    public String getAcilis_tarihi() {
        return acilis_tarihi;
    }

    public String getDosya_turu() {
        return dosya_turu;
    }

    public String getTaraf_rolu() {
        return taraf_rolu;
    }
}
