package com.emirozturk.benzerbul.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Response<E> {
    Boolean isSuccess;
    String message;
    E body;

}