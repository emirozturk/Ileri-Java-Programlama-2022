package com.emirozturk.benzerbul.Service;

import com.emirozturk.benzerbul.DataAccess.UserRepository;
import com.emirozturk.benzerbul.Model.Response;
import com.emirozturk.benzerbul.Model.Similarity;
import com.emirozturk.benzerbul.Model.User;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class SimilarityService implements  ISimilarityService{
    UserRepository userRepository;
    SimilarityService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public Response<List<Similarity>> getSimilar(String username) {
        var similarityList = new ArrayList<Similarity>();
        try {
            var users = userRepository.findAll();//Tüm kullanıcıları veritabanından çek
            var user = users.stream().filter(x->x.getUsername().equals(username)).findFirst().orElse(null);
            if(user == null) Response.Fail("Kullanıcı bulunamadı");
            for(var u:users){
                double score = Calculate(user,u); //Benzerlik hesapla
                similarityList.add(new Similarity(u,score));//Benzer kullanıcı listesini hazırla
            }
            return Response.Success(similarityList);//Success ile benzer listesini döndür
        }catch (Exception ex){
            return Response.Fail(ex.getMessage());
        }
    }

    private double Calculate(User user1, User user2) {
        var m1 = user1.getMusics();
        var m2 = user2.getMusics();
        double counter = 0;
        for(var m:m2)
            if(m1.stream().anyMatch(x -> x.getName().equals(m.getName())))
                counter++;
        return counter / m1.size();
    }
}
