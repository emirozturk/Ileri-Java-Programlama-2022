import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        /*
        var loglayici = new Loglayici();
        loglayici.logla("Veritabanına bağlandı");
        loglayici.logla("Bağlantı kuruldu");
        loglayici.kapat();
        var loglayici2 = new Loglayici();
        loglayici2.logla("Network izleniyor");
        loglayici2.logla("Paket alındı");
        loglayici2.kapat();
        System.out.println(loglayici);
        System.out.println(loglayici2);

        var sloglayici = SLoglayici.ornekAl();
        sloglayici.logla("Veritabanına bağlandı");
        sloglayici.logla("Bağlantı kuruldu");
        var sloglayici2 = SLoglayici.ornekAl();
        sloglayici2.logla("Network izleniyor");
        sloglayici2.logla("Paket alındı");
        sloglayici2.kapat();

        System.out.println(sloglayici);
        System.out.println(sloglayici2);
         */
        for(int i=0;i<10;i++)
            System.out.println(new Loglayici());
        for(int i=0;i<10;i++)
            System.out.println(SLoglayici.ornekAl());
    }
}