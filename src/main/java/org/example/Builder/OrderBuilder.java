package org.example.Builder;

public class OrderBuilder {
    private String product;
    private int quantity;
    private double price;
    private String customer;
    private String deliveryAddress;

    public OrderBuilder product(String product) {
        this.product = product;
        return this;
    }

    public OrderBuilder quantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderBuilder price(double price) {
        this.price = price;
        return this;
    }

    public OrderBuilder customer(String customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder deliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    public Order build() {
        return new Order(product,quantity,price,customer,deliveryAddress);
    }
}
