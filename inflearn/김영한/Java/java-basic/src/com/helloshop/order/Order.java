package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

/**
 *  패키지 : 2026/06/07
 */
public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
