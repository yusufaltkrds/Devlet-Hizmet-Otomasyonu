package otomasyon.demo;

public class Araclarim {
    private String tur,plaka,marka,ticari_adi,model_yili,sahiplik_yili;

    public Araclarim(String tur,String plaka,String marka,String ticari_adi,String model_yili,String sahiplik_yili) {

        this.marka = marka;
        this.tur = tur;
        this.plaka = plaka;
        this.ticari_adi = ticari_adi;
        this.model_yili = model_yili;
        this.sahiplik_yili = sahiplik_yili;

    }

    public String getTur() {
        return tur;
    }

    public String getPlaka() {
        return plaka;
    }

    public String getMarka() {
        return marka;
    }

    public String getTicari_adi() {
        return ticari_adi;
    }

    public String getModel_yili() {
        return model_yili;
    }

    public String getSahiplik_yili() {
        return sahiplik_yili;
    }
}
