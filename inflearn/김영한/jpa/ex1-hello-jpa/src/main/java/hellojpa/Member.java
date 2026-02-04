package hellojpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Entity 속성:
 * @Entity가 붙은 클래스는 JPA가 관리한다. 
 * JPA를 사용해서 테이블과 매핑할 클래스는 엔티티 필수
 */

@Entity
public class Member {


    public Member(){

    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
