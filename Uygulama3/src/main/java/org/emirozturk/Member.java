package org.emirozturk;

import lombok.Data;

import java.util.List;

@Data
public class Member {
    private String name;
    private int age;
    private String secretIdentity;
    private List<String> powers;

    @Override
    public String toString(){
        var output = "İsim:%s Yaş: %d Gizli Kimlik: %s [".formatted(name,age,secretIdentity);
        for(var power : powers)
            output+= power+" ";
        output+="]\n";
        return output;
    }
}
