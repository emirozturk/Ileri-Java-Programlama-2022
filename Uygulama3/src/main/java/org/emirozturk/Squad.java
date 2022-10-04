package org.emirozturk;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Squad {
    private String squadName;
    private String homeTown;
    private int formed;
    private String secretBase;
    private boolean active;
    private List<Member> members;

    public String getInfo() {
        return null;
    }

    public void addMember(Member newMember) {

    }

    public int removeMember(String memberName) {
        
    }

    public void updateName(String newName) {

    }
}
