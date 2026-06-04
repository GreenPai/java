package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Entity 속성:
 * @Entity가 붙은 클래스는 JPA가 관리한다. 
 * JPA를 사용해서 테이블과 매핑할 클래스는 엔티티 필수
 */

@Entity
public class Member extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    // JoinColumn에 insertable = false, updatable = false를 하지 않으면 둘 다 연관관계 주인이므로
    // 오류가 생긴다. insertable = false, updatable = false 를 넣음으로서 읽고 전용으로 설정해야된다.
    @ManyToOne
    @JoinColumn(name = "TEAM_ID", insertable = false, updatable = false)
    private Team team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}