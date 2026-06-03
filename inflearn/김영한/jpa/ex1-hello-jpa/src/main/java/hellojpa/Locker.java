package hellojpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

/**
 * 일대일 매핑을 위한 엔티티
 * 
 */
@Entity
public class Locker {

    @Id @GeneratedValue
    private  Long id;

    private String name;

    @OneToOne(mappedBy = "locker")
    private Member member;

}
