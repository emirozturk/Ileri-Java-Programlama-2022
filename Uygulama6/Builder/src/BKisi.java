public class BKisi {
    int id;
    String ad;
    String soyad;
    String adres;
    String cinsiyet;
    String isAdresi;
    BKisi(){

    }
    BKisi setId(int id){
        this.id = id;
        return this;
    }
    BKisi setAd(String ad){
        this.ad = ad;
        return this;
    }
    BKisi setSoyad(String soyad){
        this.soyad=soyad;
        return this;
    }
    BKisi setAdres(String adres){
        this.adres = adres;
        return this;
    }
    BKisi setCinsiyet(String cinsiyet){
        this.cinsiyet = cinsiyet;
        return this;
    }
    BKisi setIsAdresi(String isAdresi){
        this.isAdresi = isAdresi;
        return this;
    }

    @Override
    public String toString() {
        return "BKisi{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", adres='" + adres + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", isAdresi='" + isAdresi + '\'' +
                '}';
    }
}
