package com.emirozturk.uygulama4.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class EQ {
    private LocalDateTime tarihSaat;
    private Koordinat koordinat;
    private Magnitude siddet;
    private String yer;
    private String cozumNiteligi;

    public EQ(LocalDateTime tarihSaat, Koordinat koordinat, Magnitude siddet, String yer, String cozumNiteligi) {
        this.tarihSaat = tarihSaat;
        this.koordinat = koordinat;
        this.siddet = siddet;
        this.yer = yer;
        this.cozumNiteligi = cozumNiteligi;
    }

    public static EQ parseEt(List<String> liste){
        var tarihSaat = LocalDateTime.parse(liste.get(0)+" "+liste.get(1), DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
        var koordinat = new Koordinat(Float.parseFloat(liste.get(2)),
                Float.parseFloat(liste.get(3)),
                Float.parseFloat(liste.get(4)));
        var md = liste.get(5).equals("-.-") ?0:Float.parseFloat(liste.get(5));
        var ml = liste.get(6).equals("-.-") ?0:Float.parseFloat(liste.get(6));
        var mw = liste.get(7).equals("-.-") ?0:Float.parseFloat(liste.get(7));
        var magnitude = new Magnitude(md,ml,mw);
        String yer="";
        for(int i=8;i<liste.size()-1;i++){
            yer += liste.get(i)+ " ";
        }
        String nitelik = liste.get(liste.size()-1);
        return new EQ(tarihSaat,koordinat,magnitude,yer,nitelik);
    }
    public LocalDateTime getTarihSaat() {
        return tarihSaat;
    }

    public void setTarihSaat(LocalDateTime tarihSaat) {
        this.tarihSaat = tarihSaat;
    }

    public Koordinat getKoordinat() {
        return koordinat;
    }

    public void setKoordinat(Koordinat koordinat) {
        this.koordinat = koordinat;
    }

    public Magnitude getSiddet() {
        return siddet;
    }

    public void setSiddet(Magnitude siddet) {
        this.siddet = siddet;
    }

    public String getYer() {
        return yer;
    }

    public void setYer(String yer) {
        this.yer = yer;
    }

    public String getCozumNiteligi() {
        return cozumNiteligi;
    }

    public void setCozumNiteligi(String cozumNiteligi) {
        this.cozumNiteligi = cozumNiteligi;
    }
    @Override
    public String toString(){
        return "%s %s %s %s %s".formatted(
                tarihSaat.toString(),
                koordinat,
                siddet,
                yer,
                cozumNiteligi);
    }
}
