package org.emirozturk;

import lombok.Data;

import java.util.List;

@Data
public class Member {
    private String name;
    private int age;
    private String secretIdentity;
    private List<String> powers;
}
