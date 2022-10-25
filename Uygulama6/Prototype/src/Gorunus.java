public class Gorunus implements Kopyalanabilir {
    String renk;
    int kapiSayisi;

    public Gorunus(String renk, int kapiSayisi) {
        this.renk = renk;
        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public String toString() {
        return "Gorunus{" +
                "renk='" + renk + '\'' +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
    Gorunus(Gorunus diger){
        this.renk = diger.renk;
        this.kapiSayisi = diger.kapiSayisi;
    }
    @Override
    public Gorunus kopyala() {
        return new Gorunus(this);
    }
}
