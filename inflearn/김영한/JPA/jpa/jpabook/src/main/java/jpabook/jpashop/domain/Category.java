package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.*;

@Entity
public class Category extends BasicEntity{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

    /**
     * 아이템과 다대다
     * 실전에서는 ManyToMany를 잘 쓰지 않는다.
     */
    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
    joinColumns = @JoinColumn(name = "CATEGORY_ID"), // 내가 조인 하는 컬럼
    inverseJoinColumns = @JoinColumn(name = "ITEM_ID")) // 다른 테이블이 조인하는 컬럼
    private List<Item> items = new ArrayList<>();


}
