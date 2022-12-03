package com.emirozturk.benzerbul.REST;

import com.emirozturk.benzerbul.Model.Response;
import com.emirozturk.benzerbul.Model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/User")
public class UserRESTController {
    @GetMapping("/")
    Response<List<User>> getUsers(){
        User user1 = new User(1,"emirozturk","1234",null);
        User user2 = new User(2,"muhammetemrevatan","1234",null);
        User user3 = new User(3,"emirozturk","1234",null);
        User user4 = new User(4,"emirozturk","1234",null);
        var liste = new ArrayList<User>(Arrays.asList(user1,user2,user3,user4));
        return Response.Success(liste);
    }
    @GetMapping("/Login/username={username}&password={password}")
    Response<User> login(@PathVariable String username,@PathVariable String password){
        return Response.Success(new User());
    }

    @PostMapping("/")
    Response<User> addUser(@RequestBody User user){
        return Response.Success(new User());
    }
    @DeleteMapping("/{username}")
    Response<User> removeUser(@PathVariable String username){
        return Response.Success(new User());
    }
    @PutMapping("/{username}")
    Response<User> updateUser(@PathVariable String username,@RequestBody User user){
        return Response.Success(new User());
    }

}
