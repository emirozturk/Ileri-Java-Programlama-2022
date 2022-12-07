package com.emirozturk.benzerbul.Service;

import com.emirozturk.benzerbul.Model.Response;
import com.emirozturk.benzerbul.Model.User;

import java.util.List;

public interface ISimilarityService {
    Response<List<User>> getSimilar(String username);
}
