package com.emirozturk.benzerbul.REST;

import com.emirozturk.benzerbul.Model.Music;
import com.emirozturk.benzerbul.Model.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Music")
public class MusicRESTController {
    @PostMapping("/")
    Response<Music> addMusic(@RequestBody Music music){
      return Response.Success(new Music());
    }
    @DeleteMapping("/{id}")
    Response<Music> deleteMusic(@PathVariable int id){
        return Response.Success(new Music());
    }

}
