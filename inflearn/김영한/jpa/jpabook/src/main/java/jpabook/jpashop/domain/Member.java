package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Member extends BasicEntity {

    // @GeneratedValue 기본이 Auto
    @Id @GeneratedValue
    @Column (name = "MEMBER_ID")
    private Long id;
    private String name;

    // 값 타입
    @Embedded
    private Address address;

    /**
     * mappedBy 연관관계
     */
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

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
