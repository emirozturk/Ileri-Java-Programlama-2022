package com.emirozturk.benzerbul.Service;

import com.emirozturk.benzerbul.Model.User;
import org.springframework.stereotype.Service;
import com.emirozturk.benzerbul.Model.Response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Override
    public Response<List<User>> getUsers() {
        User user1 = new User(1,"emirozturk","1234",null);
        User user2 = new User(2,"muhammetemrevatan","1234",null);
        User user3 = new User(3,"emirozturk","1234",null);
        User user4 = new User(4,"emirozturk","1234",null);
        var liste = new ArrayList<User>(Arrays.asList(user1,user2,user3,user4));
        return Response.Success(liste);
    }

    @Override
    public Response<User> login(String username, String password) {
        return null;
    }

    @Override
    public Response<User> addUser(User user) {
        try{
            //Veritabanından user'ın olup olmadığını kontrol et
            //Eğer user varsa response.fail ile user var hatası at
            //Veritabanına user'ı ekle ve veritabanından dönen user nesnesini response ile wrap edip döndür
            return null;
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }

    @Override
    public Response<User> removeUser(String username) {
        try{
            //Veritabanında user var mı kontrol et
            //Yoksa user bulunamadı mesajını response.fail ile at
            //user'ın silme metodunu çağır ve response olarak döndür
            return null;
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }

    @Override
    public Response<User> updateUser(String username, User user) {
        try{
            //username'den user'ı veritabanında ara
            //bulunmazsa response.fail
            //user'ın alanlarını parametre olarak gelen user ile güncelle
            //yeni user'ı veritabanına yaz ( güncelleme işlemi)
            //Response.success döndür
            return null;
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }
}
