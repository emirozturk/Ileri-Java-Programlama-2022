package com.emirozturk.benzerbul.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Similarity {
    User user;
    double similarity;
}
