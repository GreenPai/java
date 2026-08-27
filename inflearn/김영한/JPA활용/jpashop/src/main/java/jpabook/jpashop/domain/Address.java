package jpabook.jpashop.domain;

import lombok.Getter;

import jakarta.persistence.Embeddable;


@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    // public 말고 protected를 한 이유. 외부에서 잘 사용 안하기 위해서 
    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}