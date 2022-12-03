package com.emirozturk.benzerbul.REST;

import com.emirozturk.benzerbul.Model.Response;
import com.emirozturk.benzerbul.Model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserRESTController {
    @GetMapping("")
    List<String> users(){
      return new ArrayList<>(Arrays.asList("U1","U2","U3"));
    }
    @PostMapping("")
    Response<User> postUser(@RequestBody User user){
        var x = user.getUsername();
        return new Response<>();
    }
    @DeleteMapping("/{id}")
    Response<User> deleteUser(@PathVariable Integer id){
        var x = id;
        return new Response<>();
    }
    @GetMapping("/{id}")
    Response<User> getUser(@PathVariable Integer id){
        var x = id;
        return new Response<>();
    }
    @PutMapping("/{id}")
    Response<User> putUser(@PathVariable Integer id,@RequestBody User user){
        var x = user.getUsername();
        var y = id;
        return new Response<>();
    }
}
