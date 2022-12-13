package com.emirozturk.benzerbul.Service;

import com.emirozturk.benzerbul.Model.Response;
import com.emirozturk.benzerbul.Model.Similarity;
import com.emirozturk.benzerbul.Model.User;

import java.util.List;

public interface ISimilarityService {
    Response<List<Similarity>> getSimilar(String username);
}
