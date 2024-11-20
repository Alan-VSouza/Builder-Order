package org.example.Builder;

public class Order {
    private final String product;
    private final int quantity;
    private final double price;
    private final String customer;
    private  final String deliveryAddress;


    public Order(String product, int quantity, double price, String customer, String deliveryAddress) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.customer = customer;
        this.deliveryAddress = deliveryAddress;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getCustomer() {
        return customer;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    @Override
    public String toString() {
        return """
            Product: %s
            Quantity: %d
            Price: %.2f
            Customer: %s
            Delivery Address: %s
            """.formatted(product, quantity, price, customer, deliveryAddress);
    }

}
