package com.emirozturk.uygulama4.Model;

public class Koordinat {
    private float enlem;
    private float boylam;
    private float derinlik;

    public Koordinat(float enlem, float boylam, float derinlik) {
        this.enlem = enlem;
        this.boylam = boylam;
        this.derinlik = derinlik;
    }

    public float getEnlem() {
        return enlem;
    }

    public void setEnlem(float enlem) {
        this.enlem = enlem;
    }

    public float getBoylam() {
        return boylam;
    }

    public void setBoylam(float boylam) {
        this.boylam = boylam;
    }

    public float getDerinlik() {
        return derinlik;
    }

    public void setDerinlik(float derinlik) {
        this.derinlik = derinlik;
    }

    @Override
    public String toString() {
        return "Enlem:" + enlem + ", boylam:" + boylam + ", derinlik:" + derinlik;
    }
}
