package study.data_jpa.dto;

import lombok.Data;
import study.data_jpa.entity.Member;

@Data
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String usernmae, String teamName) {
        this.id = id;
        this.username = usernmae;
        this.teamName = teamName;
    }
    
    public MemberDto(Member member){
        this.id = member.getId();
        this.username  = member.getUsername();
    }
}
