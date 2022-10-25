public class Arac implements Kopyalanabilir {
    int tork;
    double hacim;
    Gorunus gorunus;
    public Arac(){

    }

    public Arac(int tork, double hacim, Gorunus gorunus) {
        this.tork = tork;
        this.hacim = hacim;
        this.gorunus = gorunus;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "tork=" + tork +
                ", hacim=" + hacim +
                ", gorunus=" + gorunus +
                '}';
    }
    public Arac(Arac diger){
        this.hacim = diger.hacim;
        this.tork = diger.tork;
        this.gorunus = diger.gorunus.kopyala();
    }
    @Override
    public Arac kopyala() {
        return new Arac(this);
    }
}
