package study.data_jpa.dto;

import lombok.Data;

@Data
public class MemberDto {

    private Long id;
    private String usernmae;
    private String teamName;

    public MemberDto(Long id, String usernmae, String teamName) {
        this.id = id;
        this.usernmae = usernmae;
        this.teamName = teamName;
    }
}
