package org.example.Builder;

public class Main {
    public static void main(String[] args) {

        //sem builder
//        Order order = new Order();
//        order.setProduct("Laptop");
//        order.setQuantity(1);
//        order.setPrice(2500.00);
//        order.setCustomer("Alice Silva");
//        order.setDeliveryAddress("Rua Principal, 123");



        // com builder
        Order order = new OrderBuilder()
                .product("Laptop")
                .quantity(1)
                .price(2500.00)
                .customer("Alice Silva")
                .deliveryAddress("Rua Principal, 123")
                .build();

        System.out.println(order);
    }
}
