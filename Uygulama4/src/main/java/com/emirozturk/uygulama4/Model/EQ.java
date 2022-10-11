package com.emirozturk.uygulama4.Model;

import java.time.LocalDateTime;


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
