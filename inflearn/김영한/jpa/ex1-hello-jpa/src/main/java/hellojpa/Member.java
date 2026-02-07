package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Entity 속성:
 * @Entity가 붙은 클래스는 JPA가 관리한다. 
 * JPA를 사용해서 테이블과 매핑할 클래스는 엔티티 필수
 */

@Entity
@Table(name = "MBR")
public class Member {

    @Id
    private Long id;

    @Column(name = "name")
    // private String username;

    private Integer age;
    public Member() {

    }



}