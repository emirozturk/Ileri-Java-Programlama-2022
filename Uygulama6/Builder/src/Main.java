public class Main {
    public static void main(String[] args) {
        var kisi1 = new Kisi(1,"","","Edirne","","");
        var kisi2 = new Kisi(2,"Emir","Öztürk","","E","");
        var kisi3 = new Kisi(3,"Uğur","Yaşar","İstanbul","E","İstanbul");

        var bKisi1 = new BKisi()
                .setId(1)
                .setAdres("Edirne");
        var bKisi2 = new BKisi()
                .setId(2)
                .setAd("Emir")
                .setSoyad("Öztürk")
                .setCinsiyet("E");
        System.out.println(kisi1);
        System.out.println(bKisi1);
        System.out.println(kisi2);
        System.out.println(bKisi2);
        System.out.println(kisi3);
    }
}