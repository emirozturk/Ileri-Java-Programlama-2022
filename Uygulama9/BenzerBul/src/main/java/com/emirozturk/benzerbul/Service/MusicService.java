package com.emirozturk.benzerbul.Service;

import com.emirozturk.benzerbul.Model.Music;
import com.emirozturk.benzerbul.Model.Response;
import org.springframework.stereotype.Service;

@Service
public class MusicService implements IMusicService{
    @Override
    public Response<Music> addMusic(Music music) {
        try{
            //Veritabanından music değişkenini sorgula
            //Eğer bu değişken varsa fail at değişken var mesajı döndür
            //Veritabanına yeni nesneyi ekle
            //response.success döndür
            return null;
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }

    @Override
    public Response<Music> deleteMusic(int id) {
        try{
            //Veritabanından id sorgula
            //Eğer idye karşılık gelen music nesnesi yoksa fail at
            //Veritabanından silme işlemi yap
            //response success döndür
            return null;
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }
}
