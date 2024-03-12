package otomasyon.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.ArrayList;

public class HelloApplication extends Application {

    static ArrayList<Vatandas> vatandaslar = new ArrayList<>();

    static ArrayList<Araclarim> v1araclar = new ArrayList<>();
    static ArrayList<Araclarim> v2araclar = new ArrayList<>();
    static ArrayList<Araclarim> v3araclar = new ArrayList<>();
    static ArrayList<Araclarim> v4araclar = new ArrayList<>();

    static ArrayList<DavaDosyalarim> v1davalar = new ArrayList<>();
    static ArrayList<DavaDosyalarim> v2davalar = new ArrayList<>();
    static ArrayList<DavaDosyalarim> v3davalar = new ArrayList<>();
    static ArrayList<DavaDosyalarim> v4davalar = new ArrayList<>();

    static ArrayList<Tapularim> v1tapular = new ArrayList<>();
    static ArrayList<Tapularim> v2tapular = new ArrayList<>();
    static ArrayList<Tapularim> v3tapular = new ArrayList<>();
    static ArrayList<Tapularim> v4tapular = new ArrayList<>();

    static ArrayList<SGK> v1SGK = new ArrayList<>();
    static ArrayList<SGK> v2SGK = new ArrayList<>();
    static ArrayList<SGK> v3SGK = new ArrayList<>();
    static ArrayList<SGK> v4SGK = new ArrayList<>();

    static ArrayList<Faturalarim> v1faturalar = new ArrayList<>();
    static ArrayList<Faturalarim> v2faturalar = new ArrayList<>();
    static ArrayList<Faturalarim> v3faturalar = new ArrayList<>();
    static ArrayList<Faturalarim> v4faturalar = new ArrayList<>();


    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GirisEkrani/GirisEkrani.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getIcons().add(new Image("logo.png"));
        stage.setTitle("e-Milllet");
        stage.show();

    }

    public static void main(String[] args) {
        //araclar kismi-------------------------------------------------------------------------------------------------

        Araclarim v1arac1 = new Araclarim("Otomobil","34 PL 080","Tesla","Model Y","2022","10.09.2022");
        Araclarim v1arac2 = new Araclarim("Otomobil","34 KS 81","Ford","Mustang GT","2018","05.03.2021");
        Araclarim v1arac3 = new Araclarim("Motosiklet","34 LL 02","Honda","Dio","2020","05.01.2022");
        Araclarim v1arac4 = new Araclarim("Kamyon","34 PL 616","Ford","Transit","2016","10.08.2021");
        Araclarim v1arac5 = new Araclarim("Otomobil","34 OL 81","Fiat","Egea","2018","07.03.2021");

        v1araclar.add(v1arac1);
        v1araclar.add(v1arac2);
        v1araclar.add(v1arac3);
        v1araclar.add(v1arac4);
        v1araclar.add(v1arac5);


        Araclarim v2arac1 = new Araclarim("Kamyon","34 PL 616","Ford","Transit","2016","10.08.2021");
        Araclarim v2arac2 = new Araclarim("Otomobil","34 OL 81","Fiat","Egea","2018","07.03.2021");
        Araclarim v2arac3 = new Araclarim("Motosiklet","34 KL 02","Kawasaki","Wuling 1/12","2020","05.01.2022");
        Araclarim v2arac4 = new Araclarim("Otomobil","34 PL 080","Tesla","Model Y","2022","10.09.2022");

        v2araclar.add(v2arac1);
        v2araclar.add(v2arac2);
        v2araclar.add(v2arac3);
        v2araclar.add(v2arac4);

        Araclarim v3arac1 = new Araclarim("Tır","34 PF 080","Mercedes","Axor","2015","10.09.2018");
        Araclarim v3arac2 = new Araclarim("Otomobil","34 S 81","Tesla","Model X","2022","05.03.2023");
        Araclarim v3arac3 = new Araclarim("Motosiklet","34 AA 02","BMW","M 1000 XR","2023","05.06.2023");
        Araclarim v3arac4 = new Araclarim("Otomobil","34 KS 81","Ford","Mustang GT","2018","05.03.2021");
        Araclarim v3arac5 = new Araclarim("Motosiklet","34 LL 02","Honda","Dio","2020","05.01.2022");

        v3araclar.add(v3arac1);
        v3araclar.add(v3arac2);
        v3araclar.add(v3arac3);
        v3araclar.add(v3arac4);
        v3araclar.add(v3arac5);

        Araclarim v4arac1 = new Araclarim("Otomobil","34 AL 080","Volkswagen","Tiguan","2021","10.10.2022");
        Araclarim v4arac2 = new Araclarim("Otomobil","34 FS 81","Honda","Civic","2021","05.06.2023");
        Araclarim v4arac3 = new Araclarim("Otomobil","34 S 81","Tesla","Model X","2022","05.03.2023");
        Araclarim v4arac4 = new Araclarim("Motosiklet","34 AA 02","BMW","M 1000 XR","2023","05.06.2023");
        Araclarim v4arac5 = new Araclarim("Otomobil","34 KS 81","Ford","Mustang GT","2018","05.03.2021");
        Araclarim v4arac6 = new Araclarim("Motosiklet","34 LK 02","Ducati","1100 Dark Pro","2021","05.03.2022");

        v4araclar.add(v4arac1);
        v4araclar.add(v4arac2);
        v4araclar.add(v4arac3);
        v4araclar.add(v4arac4);
        v4araclar.add(v4arac5);
        v4araclar.add(v4arac6);


        //araclar kismi bitti-------------------------------------------------------------------------------------------


        //davalar kismi ------------------------------------------------------------------------------------------------

        DavaDosyalarim v1dava1 = new DavaDosyalarim("Antalya 56.Asliye Hukuk Mahkemesi","2000-04-26","Ceza Dava Dosyası","Davacı");
        DavaDosyalarim v1dava2 = new DavaDosyalarim("İstanbul 20. Sulh Hukuk Mahkemesi","2005-01-23","Hukuk Dava Dosyası","Davalı");
        DavaDosyalarim v1dava3 = new DavaDosyalarim("Ankara 2. Ağır Ceza Mahkemesi","2010-04-24","Ceza Dava Dosyası","Davalı");

        v1davalar.add(v1dava1);
        v1davalar.add(v1dava2);
        v1davalar.add(v1dava3);

        DavaDosyalarim v2dava1 = new DavaDosyalarim("İstanbul 5.İş Mahkemesi","2000-04-26","Ceza Dava Dosyası","Davacı");
        DavaDosyalarim v2dava2 = new DavaDosyalarim("İzmir 4.İcra Mahkemesi","2005-01-23","Hukuk Dava Dosyası","Davalı");
        DavaDosyalarim v2dava3 = new DavaDosyalarim("Ankara 2. Asliye Hukuk Mahkemesi","2010-04-24","Hukuk Dava Dosyası","Davacı");

        v2davalar.add(v2dava1);
        v2davalar.add(v2dava2);
        v2davalar.add(v2dava3);

        DavaDosyalarim v3dava1 = new DavaDosyalarim("Trabzon 1. Asliye Hukuk Mahkemesi","2000-04-26","Hukuk Dava Dosyası","Sanık");
        DavaDosyalarim v3dava2 = new DavaDosyalarim("Muğla 5. Sulh Hukuk Mahkemesi","2005-01-23","Hukuk Dava Dosyası","Sanık");
        DavaDosyalarim v3dava3 = new DavaDosyalarim("Adana 2. Ağır Ceza Mahkemesi","2010-04-24","Ceza Dava Dosyası","Sanık");

        v3davalar.add(v3dava1);
        v3davalar.add(v3dava2);
        v3davalar.add(v3dava3);

        DavaDosyalarim v4dava1 = new DavaDosyalarim("Mersin 6. Asliye Ceza Mahkemesi","2000-04-26","Ceza Dava Dosyası","Sanık");
        DavaDosyalarim v4dava2 = new DavaDosyalarim("Konya 11. Ağır Ceza Mahkemesi","2005-01-23","Ceza Dava Dosyası","Sanık");
        DavaDosyalarim v4dava3 = new DavaDosyalarim("Eskişehir 2. İş Mahkemesi","2010-04-24","Hukuk Dava Dosyası","Sanık");

        v4davalar.add(v4dava1);
        v4davalar.add(v4dava2);
        v4davalar.add(v4dava3);

        //davalar kismi bitti-------------------------------------------------------------------------------------------


        //tapularim kismi-----------------------------------------------------------------------------------------------

        Tapularim v1tapu1 = new Tapularim("İstanbul","Maltepe","Zümrütevler Mahallesi","Emek Caddesi no:91","Kat Mülkiyeti","Mesken");
        Tapularim v1tapu2 = new Tapularim("İstanbul","Kadıköy","Bostancı Mahallesi","Paşa Caddesi no:51","Hisseli Tapu","Mesken");
        Tapularim v1tapu3 = new Tapularim("İstanbul","Üsküdar","Beylerbeyi Mahallesi","Kandil Caddesi no:91","Hisseli Tapu","Avlulu Kalgir Ev");
        Tapularim v1tapu4 = new Tapularim("İzmir","Bornova","Zafer Mahallesi","Çiçek Caddesi no:91","Kat Mülkiyeti","Mesken");
        Tapularim v1tapu5 = new Tapularim("Ankara","Çankaya","Beylerbeyi Mahallesi","Kandil Caddesi no:91","Hisseli Tapu","Avlulu Kalgir Ev");
        Tapularim v1tapu6 = new Tapularim("Adana","Ceyhan","Bostancı Mahallesi","Paşa Caddesi no:51","Hisseli Tapu","Mesken");

        v1tapular.add(v1tapu1);
        v1tapular.add(v1tapu2);
        v1tapular.add(v1tapu3);
        v1tapular.add(v1tapu4);
        v1tapular.add(v1tapu5);
        v1tapular.add(v1tapu6);

        Tapularim v2tapu1 = new Tapularim("İzmir","Buca","Zafer Mahallesi","Çiçek Caddesi no:91","Kat Mülkiyeti","Mesken");
        Tapularim v2tapu2 = new Tapularim("Ankara","Çankaya","Beylerbeyi Mahallesi","Kandil Caddesi no:91","Hisseli Tapu","Avlulu Kalgir Ev");
        Tapularim v2tapu3 = new Tapularim("Adana","Ceyhan","Bostancı Mahallesi","Paşa Caddesi no:51","Hisseli Tapu","Mesken");
        Tapularim v2tapu4 = new Tapularim("İstanbul","Maltepe","Zümrütevler Mahallesi","Emek Caddesi no:91","Kat Mülkiyeti","Mesken");
        Tapularim v2tapu5 = new Tapularim("İstanbul","Kadıköy","Caddebostan Mahallesi","Paşa Caddesi no:51","Hisseli Tapu","Mesken");

        v2tapular.add(v2tapu1);
        v2tapular.add(v2tapu2);
        v2tapular.add(v2tapu3);
        v2tapular.add(v2tapu4);
        v2tapular.add(v2tapu5);

        Tapularim v3tapu1 = new Tapularim("Ankara","Çankaya","Beylerbeyi Mahallesi","Kandil Caddesi no:91","Hisseli Tapu","Avlulu Kalgir Ev");
        Tapularim v3tapu2 = new Tapularim("Adana","Ceyhan","Bostancı Mahallesi","Paşa Caddesi no:51","Hisseli Tapu","Mesken");
        Tapularim v3tapu3 = new Tapularim("Bursa","İnegöl","Zafer Mahallesi","Çiçek Caddesi no:91","Kat Mülkiyeti","Mesken");
        Tapularim v3tapu4 = new Tapularim("Kocaeli","Gebze","Beylerbeyi Mahallesi","Kandil Caddesi no:91","Hisseli Tapu","Avlulu Kalgir Ev");
        Tapularim v3tapu5 = new Tapularim("Mersin","Tarsus","Zümrütevler Mahallesi","Emek Caddesi no:91","Kat Mülkiyeti","Mesken");
        Tapularim v3tapu6 = new Tapularim("İstanbul","Maltepe","Bostancı Mahallesi","Paşa Caddesi no:51","Hisseli Tapu","Mesken");

        v3tapular.add(v3tapu1);
        v3tapular.add(v3tapu2);
        v3tapular.add(v3tapu3);
        v3tapular.add(v3tapu4);
        v3tapular.add(v3tapu5);
        v3tapular.add(v3tapu6);

        Tapularim v4tapu1 = new Tapularim("Sivas","Kangal","Zafer Mahallesi","Çiçek Caddesi no:91","Kat Mülkiyeti","Mesken");
        Tapularim v4tapu2 = new Tapularim("Mersin","Tarsus","Zümrütevler Mahallesi","Emek Caddesi no:91","Kat Mülkiyeti","Mesken");
        Tapularim v4tapu3 = new Tapularim("İstanbul","Maltepe","Bostancı Mahallesi","Paşa Caddesi no:51","Hisseli Tapu","Mesken");
        Tapularim v4tapu4 = new Tapularim("Aydın","Didim","Beylerbeyi Mahallesi","Kandil Caddesi no:91","Hisseli Tapu","Avlulu Kalgir Ev");
        Tapularim v4tapu5 = new Tapularim("Eskişehir","Sivrihisar","Zümrütevler Mahallesi","Emek Caddesi no:91","Kat Mülkiyeti","Mesken");
        Tapularim v4tapu6 = new Tapularim("İstanbul","Maltepe","Bostancı Mahallesi","Paşa Caddesi no:51","Hisseli Tapu","Mesken");

        v4tapular.add(v4tapu1);
        v4tapular.add(v4tapu2);
        v4tapular.add(v4tapu3);
        v4tapular.add(v4tapu4);
        v4tapular.add(v4tapu5);
        v4tapular.add(v4tapu6);

        //tapular bitti-------------------------------------------------------------------------------------------------


        //SGK kismi
        SGK v1SGK1 = new SGK("  4A","SSK 2925 Tarim","2023/10","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK2 = new SGK("  4A","SSK 2925 Tarim","2023/9","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK3 = new SGK("  4A","SSK 2925 Tarim","2023/8","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK4 = new SGK("  4A","SSK 2925 Tarim","2023/7","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK5 = new SGK("  4A","SSK 2925 Tarim","2023/6","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK6 = new SGK("  4A","SSK 2925 Tarim","2023/5","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK7 = new SGK("  4A","SSK 2925 Tarim","2023/4","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK8 = new SGK("  4A","SSK 2925 Tarim","2023/3","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK9 = new SGK("  4A","SSK 2925 Tarim","2023/2","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK10 = new SGK("  4A","SSK 2925 Tarim","2023/1","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK11 = new SGK("  4A","SSK 2925 Tarim","2022/12","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK12 = new SGK("  4A","SSK 2925 Tarim","2022/11","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK13 = new SGK("  4A","SSK 2925 Tarim","2022/10","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK14 = new SGK("  4A","SSK 2925 Tarim","2022/9","Muhammed Yusuf","Altıkardeş");
        SGK v1SGK15 = new SGK("  4A","SSK 2925 Tarim","2022/8","Muhammed Yusuf","Altıkardeş");

        v1SGK.add(v1SGK1);
        v1SGK.add(v1SGK2);
        v1SGK.add(v1SGK3);
        v1SGK.add(v1SGK4);
        v1SGK.add(v1SGK5);
        v1SGK.add(v1SGK6);
        v1SGK.add(v1SGK7);
        v1SGK.add(v1SGK8);
        v1SGK.add(v1SGK9);
        v1SGK.add(v1SGK10);
        v1SGK.add(v1SGK11);
        v1SGK.add(v1SGK12);
        v1SGK.add(v1SGK13);
        v1SGK.add(v1SGK14);
        v1SGK.add(v1SGK15);

        SGK v2SGK1 = new SGK("  4B","Bağ-Kur","2023/10","Muhammed Alper","Geçili");
        SGK v2SGK2 = new SGK("  4B","Bağ-Kur","2023/9","Muhammed Alper","Geçili");
        SGK v2SGK3 = new SGK("  4B","Bağ-Kur","2023/8","Muhammed Alper","Geçili");
        SGK v2SGK4 = new SGK("  4B","Bağ-Kur","2023/7","Muhammed Alper","Geçili");
        SGK v2SGK5 = new SGK("  4B","Bağ-Kur","2023/6","Muhammed Alper","Geçili");

        v2SGK.add(v2SGK1);
        v2SGK.add(v2SGK2);
        v2SGK.add(v2SGK3);
        v2SGK.add(v2SGK4);
        v2SGK.add(v2SGK5);

        SGK v3SGK1 = new SGK("  4A","SSK","2023/10","Ahmet Buğra","Yüksel");
        SGK v3SGK2 = new SGK("  4A","SSK","2023/9","Ahmet Buğra","Yüksel");
        SGK v3SGK3 = new SGK("  4A","SSK","2023/8","Ahmet Buğra","Yüksel");
        SGK v3SGK4 = new SGK("  4A","SSK","2023/7","Ahmet Buğra","Yüksel");
        SGK v3SGK5 = new SGK("  4A","SSK","2023/6","Ahmet Buğra","Yüksel");

        v3SGK.add(v3SGK1);
        v3SGK.add(v3SGK2);
        v3SGK.add(v3SGK3);
        v3SGK.add(v3SGK4);
        v3SGK.add(v3SGK5);

        SGK v4SGK1 = new SGK("  4C","SSK","2023/10","Mehmet","Aksoy");
        SGK v4SGK2 = new SGK("  4C","SSK","2023/9","Mehmet","Aksoy");
        SGK v4SGK3 = new SGK("  4C","SSK","2023/8","Mehmet","Aksoy");
        SGK v4SGK4 = new SGK("  4C","SSK","2023/7","Mehmet","Aksoy");
        SGK v4SGK5 = new SGK("  4C","SSK","2023/6","Mehmet","Aksoy");

        v4SGK.add(v4SGK1);
        v4SGK.add(v4SGK2);
        v4SGK.add(v4SGK3);
        v4SGK.add(v4SGK4);
        v4SGK.add(v4SGK5);

        //SGK kismi bitti-----------------------------------------------------------------------------------------------


        //Faturalarim kismi---------------------------------------------------------------------------------------------

        Faturalarim v1fatura1 = new Faturalarim("Elektrik","80240","10/12/2023","785","Muhammed Yusuf","Altıkardeş");
        Faturalarim v1fatura2 = new Faturalarim("Doğalgaz","65413","10/12/2023","152","Muhammed Yusuf","Altıkardeş");
        Faturalarim v1fatura3 = new Faturalarim("   Su   ","48651","10/12/2023","645","Muhammed Yusuf","Altıkardeş");

        v1faturalar.add(v1fatura1);
        v1faturalar.add(v1fatura2);
        v1faturalar.add(v1fatura3);

        Faturalarim v2fatura1 = new Faturalarim("Telefon","46511","10/12/2023","561","Muhammed Alper","Geçili");
        Faturalarim v2fatura2 = new Faturalarim("Elektrik","6548513","10/12/2023","3212","Muhammed Alper","Geçili");
        Faturalarim v2fatura3 = new Faturalarim("Doğalgaz","161513","10/12/2023","353","Muhammed Alper","Geçili");

        v2faturalar.add(v2fatura1);
        v2faturalar.add(v2fatura2);
        v2faturalar.add(v2fatura3);

        Faturalarim v3fatura1 = new Faturalarim("Doğalgaz","65115","10/12/2023","232","Ahmet Buğra","Yüksel");
        Faturalarim v3fatura2 = new Faturalarim("   Su   ","48651","10/12/2023","1451","Ahmet Buğra","Yüksel");
        Faturalarim v3fatura3 = new Faturalarim("Elektrik","894651","10/12/2023","2312","Ahmet Buğra","Yüksel");

        v3faturalar.add(v3fatura1);
        v3faturalar.add(v3fatura2);
        v3faturalar.add(v3fatura3);

        Faturalarim v4fatura1 = new Faturalarim("Elektrik","54132","10/12/2023","956","Mehmet","Aksoy");
        Faturalarim v4fatura2 = new Faturalarim("Telefon","64851","10/12/2023","851","Mehmet","Aksoy");
        Faturalarim v4fatura3 = new Faturalarim("Doğalgaz","54122","10/12/2023","562","Mehmet","Aksoy");

        v4faturalar.add(v4fatura1);
        v4faturalar.add(v4fatura2);
        v4faturalar.add(v4fatura3);

        //Faturalar kismi bitti-----------------------------------------------------------------------------------------







        Vatandas vatandas1 = new Vatandas("68412541231","yusuf123","05412113513","Muhammed Yusuf","Altıkardeş",v1araclar,v1davalar,v1tapular,v1SGK,v1faturalar);
        Vatandas vatandas2 = new Vatandas("33664821342","alper123","05451665451","Muhammed Alper","Geçili",v2araclar,v2davalar,v2tapular,v2SGK,v2faturalar);
        Vatandas vatandas3 = new Vatandas("56646134513","ahmet123","05423165511","Ahmet Buğra","Yüksel",v3araclar,v3davalar,v3tapular,v3SGK,v3faturalar);
        Vatandas vatandas4 = new Vatandas("42126523122","mehmet123","05313141252","Mehmet","Aksoy",v4araclar,v4davalar,v4tapular,v4SGK,v4faturalar);

        vatandaslar.add(vatandas1);
        vatandaslar.add(vatandas2);
        vatandaslar.add(vatandas3);
        vatandaslar.add(vatandas4);



        launch(args);
    }
}