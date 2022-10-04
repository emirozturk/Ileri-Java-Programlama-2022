package org.emirozturk;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class Squad {
    private String squadName;
    private String homeTown;
    private int formed;
    private String secretBase;
    private boolean active;
    private List<Member> members;

    public void addMember(Member newMember) {
        if(!(members.stream()
                .anyMatch(x -> x.getName().
                        equals(newMember.getName()))))
            members.add(newMember);
        System.out.println("Eklenemedi");
    }

    public int removeMember(String memberName) {
        try {
            var member = members.stream().
                    filter(x -> x.getName() == memberName).
                    findFirst().orElse(null);
            if (member != null) {
                members.remove(member);
                return 1;
            } else {
                return 0;
            }
        }catch (Exception ex){
            return -1;
        }
    }

    public void updateName(String newName) {
        this.squadName = newName;
    }
    public String print() {
        var output = new StringBuilder();
        output.append("Takım Adı:%s\n".formatted(squadName));
        output.append("Yerleşim Yeri:%s\n".formatted(homeTown));
        output.append("Kuruluş yılı:%d\n".formatted(formed));
        output.append("Gizli yer:%s\n".formatted(secretBase));
        output.append("Aktif mi:%s\n".formatted(active?"Evet":"Hayır"));
        for(var member : members)
            output.append(member.toString());
        return output.toString();
    }
}
