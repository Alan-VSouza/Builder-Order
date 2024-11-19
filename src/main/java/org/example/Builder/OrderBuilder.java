package org.example.Builder;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        order = new Order();
    }

    public OrderBuilder product(String product) {
        order.setProduct(product);
        return this;
    }

    public OrderBuilder quantity(int quantity) {
        order.setQuantity(quantity);
        return this;
    }

    public OrderBuilder price(double price) {
        order.setPrice(price);
        return this;
    }

    public OrderBuilder customer(String customer) {
        order.setCustomer(customer);
        return this;
    }

    public OrderBuilder deliveryAddress(String deliveryAddress) {
        order.setDeliveryAddress(deliveryAddress);
        return this;
    }

    public Order build() {
        return order;
    }
}
