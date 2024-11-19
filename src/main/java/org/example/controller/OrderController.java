package org.example.controller;

import org.example.model.Order;
import org.example.view.OrderView;

public class OrderController {
    private final OrderView view;

    public OrderController(OrderView view) {
        this.view = view;
    }

    public void createOrder(String product, int quantity, double price, String customer) {
        createOrder(product, quantity, price, customer, null);
    }

    public void createOrder(String product, int quantity, double price, String customer, String deliveryAddress) {
        Order order = Order.builder()
                .product(product)
                .quantity(quantity)
                .price(price)
                .customer(customer)
                .deliveryAddress(deliveryAddress)
                .build();

        view.displayOrder(order);
    }
}
