package org.example.Builder;

public class Order {
    private String product;
    private int quantity;
    private double price;
    private String customer;
    private  String deliveryAddress;


    public void setProduct(String product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setDeliveryAddress(String deliveryAddress){
        this.deliveryAddress = deliveryAddress;
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
