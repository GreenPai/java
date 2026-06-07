package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

/**
 *  패키지 : 2026/06/07
 */
public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
