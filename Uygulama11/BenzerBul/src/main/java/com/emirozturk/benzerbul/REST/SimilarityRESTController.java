package com.emirozturk.benzerbul.REST;

import com.emirozturk.benzerbul.Model.Response;
import com.emirozturk.benzerbul.Model.User;
import com.emirozturk.benzerbul.Model.UserSimilarity;
import com.emirozturk.benzerbul.Service.ISimilarityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/Similarity")
public class SimilarityRESTController {
    ISimilarityService similarityService;
    SimilarityRESTController(ISimilarityService similarityService){
        this.similarityService = similarityService;
    }
    @GetMapping("/{username}")
    ResponseEntity<Response<List<UserSimilarity>>> getSimilar(@PathVariable String username){
        var response = similarityService.getSimilar(username);
        if(response.getIsSuccess())
            return ResponseEntity.ok(response);
        return ResponseEntity.badRequest().body(response);
    }
}
