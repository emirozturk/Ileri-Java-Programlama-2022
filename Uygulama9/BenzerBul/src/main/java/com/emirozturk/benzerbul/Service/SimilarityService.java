package com.emirozturk.benzerbul.Service;

import com.emirozturk.benzerbul.Model.Response;
import com.emirozturk.benzerbul.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimilarityService implements  ISimilarityService{
    @Override
    public Response<List<User>> getSimilar(String username) {
        try {
            //Tüm kullanıcıları veritabanından çek
            //Benzerlik hesapla
            //Benzer kullanıcı listesini hazırla
            //Success ile benzer listesini döndür
            return null;
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }
}
