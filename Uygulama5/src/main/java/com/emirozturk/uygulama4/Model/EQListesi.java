package com.emirozturk.uygulama4.Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EQListesi {
    List<EQ> liste;
    public EQListesi(List<EQ> liste){
        this.liste = liste;
    }

    public List<EQ> getListe() {
        return liste;
    }

    public static EQListesi dosyadanOku(String dosyaYolu){
        try {
            List<EQ> liste = new ArrayList<>();
            int satirSayisi = 0;
            var satirlar = Files.readAllLines(Path.of(dosyaYolu));
            for(var satir:satirlar){
                if(satirSayisi<2){satirSayisi++;continue;}
                var dizi = satir.split(" ");
                var alanlar = Arrays.asList(dizi).stream().filter(x->x!="").toList();
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
        return liste.stream().filter(x->x.getTarihSaat().toLocalDate().equals(tarihSaat)).toList();
    }
}
