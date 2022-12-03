package com.emirozturk.benzerbul.REST;

import com.emirozturk.benzerbul.Model.Response;
import com.emirozturk.benzerbul.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/Similarity")
public class SimilarityRESTController {
    @GetMapping("/{username}")
    Response<List<User>> GetSimilar(@PathVariable String username){
        return Response.Success(new ArrayList<User>());
    }
}
