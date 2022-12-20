package com.emirozturk.benzerbul.REST;

import com.emirozturk.benzerbul.Model.Response;
import com.emirozturk.benzerbul.Model.User;
import com.emirozturk.benzerbul.Service.IUserService;
import com.emirozturk.benzerbul.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/User")
public class UserRESTController {
    IUserService userService;
    UserRESTController(IUserService userService){
        this.userService = userService;
    }
    @GetMapping("/")
    ResponseEntity<Response<List<User>>> getUsers(){
        var response = userService.getUsers();
        if(response.getIsSuccess())
            return  ResponseEntity.ok(response);
        else
            return ResponseEntity.badRequest().body(response);
    }
    @GetMapping("/Login/username={username}&password={password}")
    ResponseEntity<Response<User>> login(@PathVariable String username,@PathVariable String password){
        var response = userService.login(username,password);
        if(response.getIsSuccess())
            return  ResponseEntity.ok(response);
        else
            return ResponseEntity.badRequest().body(response);
    }

    @PostMapping("/")
    ResponseEntity<Response<User>> addUser(@RequestBody User user){
        var response = userService.addUser(user);
        if(response.getIsSuccess())
            return  ResponseEntity.ok(response);
        else
            return ResponseEntity.badRequest().body(response);
    }
    @PostMapping("/{username}/AddMusic/{id}")
    ResponseEntity<Response<User>> addUser(@PathVariable String username,@PathVariable int id){
        Response<User> response = userService.addMusicToUser(username,id);
        if(response.getIsSuccess())
            return  ResponseEntity.ok(response);
        else
            return ResponseEntity.badRequest().body(response);
    }
    @DeleteMapping("/{username}")
    ResponseEntity<Response<User>> removeUser(@PathVariable String username){
        var response = userService.removeUser(username);
        if(response.getIsSuccess())
            return  ResponseEntity.ok(response);
        else
            return ResponseEntity.badRequest().body(response);
    }
    @PutMapping("/{username}")
    ResponseEntity<Response<User>> updateUser(@PathVariable String username,@RequestBody User user){
        var response = userService.updateUser(username,user);
        if(response.getIsSuccess())
            return  ResponseEntity.ok(response);
        else
            return ResponseEntity.badRequest().body(response);
    }

}
