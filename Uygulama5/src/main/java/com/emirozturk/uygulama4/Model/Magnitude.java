package com.emirozturk.uygulama4.Model;

public class Magnitude {
    private float MD;
    private float ML;
    private float Mw;

    public Magnitude(float MD, float ML,float Mw){
        this.MD = MD;
        this.ML = ML;
        this.Mw = Mw;
    }
    public float getMD(){
        return MD;
    }
    public void setMD(float MD){
        this.MD = MD;
    }

    public float getML() {
        return ML;
    }

    public void setML(float ML) {
        this.ML = ML;
    }

    public float getMw() {
        return Mw;
    }

    public void setMw(float mw) {
        Mw = mw;
    }

    @Override
    public String toString() {
        return "MD:" + MD + ", ML=" + ML + ", Mw=" + Mw;
    }
}
