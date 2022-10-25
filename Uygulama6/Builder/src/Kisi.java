public class Kisi {
    int id;
    String ad;
    String soyad;
    String adres;
    String cinsiyet;
    String isAdresi;

    Kisi(int id,String ad,String soyad,String adres,String cinsiyet,String isAdresi){
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.cinsiyet = cinsiyet;
        this.isAdresi = isAdresi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", adres='" + adres + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", isAdresi='" + isAdresi + '\'' +
                '}';
    }
}
