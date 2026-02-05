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
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    // 최신 버전에서는 @Temporal(TemporalType.TIMESTAMP) 를 하지 않아도 지원
    private LocalDate testLocalDate;

    private LocalDateTime testLocalDateTime;

    @Lob
    private String description;

    public Member() {

    }

}