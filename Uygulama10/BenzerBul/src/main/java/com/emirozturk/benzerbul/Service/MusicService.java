package com.emirozturk.benzerbul.Service;

import com.emirozturk.benzerbul.DataAccess.MusicRepository;
import com.emirozturk.benzerbul.Model.Music;
import com.emirozturk.benzerbul.Model.Response;
import org.springframework.stereotype.Service;

@Service
public class MusicService implements IMusicService{
    MusicRepository musicRepository;
    MusicService(MusicRepository musicRepository){
        this.musicRepository = musicRepository;
    }
    @Override
    public Response<Music> addMusic(Music music) {
        try{
            var result = musicRepository.findAll().stream().filter(x->x.getName().equals(music.getName())).findFirst().orElse(null);//Veritabanından music değişkenini sorgula
            if(result!=null)return Response.Fail("Parça mevcut"); //Eğer bu değişken varsa fail at değişken var mesajı döndür
            return Response.Success(musicRepository.save(music));//Veritabanına yeni nesneyi ekle
            //response.success döndür
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }

    @Override
    public Response<Music> deleteMusic(int id) {
        try{
            var result = musicRepository.findById(id).orElse(null);//Veritabanından id sorgula
            if(result == null)return Response.Fail("Bulunamadı.");//Eğer idye karşılık gelen music nesnesi yoksa fail at
            musicRepository.delete(result);//Veritabanından silme işlemi yap
            return Response.Success(result);//response success döndür
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }
}
