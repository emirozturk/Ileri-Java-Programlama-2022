package com.emirozturk.uygulama4.Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EQListesi {
    List<EQ> liste;

    public EQListesi(List<EQ> liste) {
        this.liste = liste;
    }

    public List<EQ> getListe() {
        return liste;
    }

    public static EQListesi dosyadanOku(String dosyaAdi) {
        try {
            List<EQ> liste = new ArrayList<>();
            int satirSayisi = 0;
            // her bilgisayarda calissin diye System.getProperty kullandik.
            // Normalde Files.readAllines("C:/Users/username/desktop/boun.txt") gibi direkt elle verebilirdik
            var satirlar = Files.readAllLines(Paths.get(System.getProperty("user.dir"), "Uygulama4", dosyaAdi));
            for (var satir : satirlar) {
                if (satirSayisi < 2) {
                    satirSayisi++;
                    continue;
                }
                var dizi = satir.split(" ");
                var alanlar = Arrays.stream(dizi).filter(x -> x != "").toList();
                liste.add(EQ.parseEt(alanlar));
            }
            return new EQListesi(liste);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void EQEkle(EQ eq) {
        liste.add(eq);
    }

    public void sil(int index) {
        liste.remove(index);
    }

    public List<EQ> ara(LocalDate tarihSaat) {
        return liste.stream().filter(x -> x.getTarihSaat().toLocalDate().equals(tarihSaat)).toList();
    }
}
