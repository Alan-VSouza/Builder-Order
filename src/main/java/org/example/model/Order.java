package org.example.model;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder(builderMethodName = "stepBuilder", buildMethodName = "build") // Define o tipo de builder como stepbuilder
public class Order {
    private final String product;
    private final int quantity;
    private final double price;
    private final String customer;
    private final String deliveryAddress;

    public static ProductStep builder() { //
        return new OrderSteps();
    }

    public interface ProductStep {
        QuantityStep product(String product);
    }

    public interface QuantityStep {
        PriceStep quantity(int quantity);
    }

    public interface PriceStep {
        CustomerStep price(double price);
    }

    public interface CustomerStep {
        FinalStep customer(String customer);
    }

    public interface FinalStep {
        FinalStep deliveryAddress(String deliveryAddress);
        Order build();
    }

    private static class OrderSteps implements ProductStep, QuantityStep, PriceStep, CustomerStep, FinalStep {
        private String product;
        private int quantity;
        private double price;
        private String customer;
        private String deliveryAddress;

        @Override
        public QuantityStep product(String product) {
            this.product = product;
            return this;
        }

        @Override
        public PriceStep quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        @Override
        public CustomerStep price(double price) {
            this.price = price;
            return this;
        }

        @Override
        public FinalStep customer(String customer) {
            this.customer = customer;
            return this;
        }

        @Override
        public FinalStep deliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        @Override
        public Order build() {
            return Order.stepBuilder()
                    .product(product)
                    .quantity(quantity)
                    .price(price)
                    .customer(customer)
                    .deliveryAddress(deliveryAddress)
                    .build();
        }
    }
    @Override
    public String toString() { // O Lombok gera automaticamente o toString, mas aqui estamos sobrescrevendo para personalizá-lo
        return
                "=====================================\n" +
                "Product:           " + product + "\n" +
                "Quantity:          " + quantity + "\n" +
                "Price:             $" + String.format("%.2f", price) + "\n" +
                "Customer:          " + customer + "\n" +
                "Delivery Address:  " + (deliveryAddress != null ? deliveryAddress : "Not Provided") + "\n" +
                "=====================================";
    }
}
