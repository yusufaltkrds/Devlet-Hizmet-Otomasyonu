package otomasyon.demo;


import java.util.ArrayList;

public class Vatandas {

    private String tc_no,ad,soyad,parola,telefon;
    private ArrayList <Araclarim> araclarim;
    private ArrayList <DavaDosyalarim> davalarim;
    private ArrayList <Tapularim> tapularim;
    private ArrayList <SGK> SGKlar;
    private ArrayList <Faturalarim> faturalarim;
    public Vatandas(String tc_no,String parola,String telefon,String ad,String soyad,ArrayList<Araclarim> araclarim,ArrayList<DavaDosyalarim> davalarim,ArrayList<Tapularim> tapularim,ArrayList<SGK> SGKlar,ArrayList<Faturalarim> faturalarim){
        this.tc_no = tc_no;
        this.parola = parola;
        this.telefon = telefon;
        this.ad = ad;
        this.soyad = soyad;
        this.araclarim = araclarim;
        this.davalarim = davalarim;
        this.tapularim = tapularim;
        this.SGKlar = SGKlar;
        this.faturalarim = faturalarim;
    }

    public String getTc_no() {
        return tc_no;
    }

    public void setTc_no(String tc_no) {
        this.tc_no = tc_no;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public ArrayList<Araclarim> getAraclarim() {
        return araclarim;
    }

    public ArrayList<DavaDosyalarim> getDavalarim() {return davalarim;}

    public ArrayList<Tapularim> getTapularim() {return tapularim;
    }

    public ArrayList<SGK> getSGKlar() {
        return SGKlar;
    }

    public ArrayList<Faturalarim> getFaturalarim() {
        return faturalarim;
    }
}
