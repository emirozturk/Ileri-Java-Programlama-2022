public class Main {
    public static void main(String[] args) {
        var arac = new Arac(120,
                2.0,
                new Gorunus("Yeşil",
                        5));
        /*
        System.out.println(arac);
        var yeniArac = arac;
        yeniArac.hacim=1.3;
        System.out.println(yeniArac);
        System.out.println(arac);
        System.out.println(arac.hashCode());
        System.out.println(yeniArac.hashCode());
         */
        System.out.println(arac);
        var yeniArac = arac.kopyala();
        yeniArac.hacim = 1.4;
        yeniArac.gorunus.kapiSayisi=3;
        System.out.println(yeniArac);
        System.out.println(arac);
        System.out.println(arac.hashCode());
        System.out.println(yeniArac.hashCode());
    }
}