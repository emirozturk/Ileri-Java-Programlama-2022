package com.emirozturk.benzerbul.Service;

import com.emirozturk.benzerbul.DataAccess.MusicRepository;
import com.emirozturk.benzerbul.DataAccess.UserRepository;
import com.emirozturk.benzerbul.Model.User;
import org.springframework.stereotype.Service;
import com.emirozturk.benzerbul.Model.Response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService implements IUserService {
    UserRepository userRepository;
    MusicRepository musicRepository;
    UserService(UserRepository userRepository,MusicRepository musicRepository){
        this.userRepository = userRepository;
        this.musicRepository = musicRepository;
    }
    @Override
    public Response<List<User>> getUsers() {
        try{
            return Response.Success(userRepository.findAll());
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }

    @Override
    public Response<User> login(String username, String password) {
        try {
            var users = userRepository.findAll();
            /*
            for(var user:users){
                if(user.getUsername().equals(username) && user.getPassword().equals(password))
                    return Response.Success(user);
            }
            */
            var result = users
                    .stream()
                    .filter(x->x.getUsername().equals(username) && x.getPassword().equals(password))
                    .findFirst()
                    .orElse(null);
            return Response.Success(result);
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }

    @Override
    public Response<User> addUser(User user) {
        try{
            var result = exists(user.getUsername());
            //Eğer user varsa response.fail ile user var hatası at
            if(result != null)
                return Response.Fail("Kullanıcı mevcut");
            //Veritabanına user'ı ekle ve veritabanından dönen user nesnesini response ile wrap edip döndür
            return Response.Success(userRepository.save(user));
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }

    @Override
    public Response<User> removeUser(String username) {
        try{
            var result = exists(username);
            if(result == null)
                return Response.Fail("Kullanıcı yok");//Yoksa user bulunamadı mesajını response.fail ile at
            //user'ın silme metodunu çağır ve response olarak döndür
            userRepository.delete(result);
            return Response.Success(result);
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }

    @Override
    public Response<User> updateUser(String username, User user) {
        try{
            var result = exists(username); //Veritabanından user'ın olup olmadığını kontr
            if(result==null)return Response.Fail("Kullanıcı bulunamadı."); // bulunmazsa response.fail
            result.setPassword(user.getPassword()); //user'ın alanlarını parametre olarak gelen user ile güncelle
            return Response.Success(userRepository.save(result)); //yeni user'ı veritabanına yaz ( güncelleme işlemi)
            //Response.success döndür
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }

    @Override
    public Response<User> addMusicToUser(String username, int id) {
        var result = exists(username);
        if(result==null)return Response.Fail("Kullanıcı bulunamadı");
        var musicResult = musicRepository.findById(id).orElse(null);
        if(musicResult==null)return Response.Fail("Parça bulunamadı");
        result.getMusics().add(musicResult);
        return Response.Success(userRepository.save(result));
    }

    private User exists(String username){
        return userRepository
                .findAll()
                .stream()
                .filter(x->x.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
}
