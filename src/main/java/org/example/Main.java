package org.example;

import org.example.lombok.controller.OrderController;
import org.example.lombok.view.OrderView;

public class Main {
    public static void main(String[] args) {
        OrderView view = new OrderView();

        OrderController controller = new OrderController(view);

        controller.createOrder(
                "Laptop",
                1,
                2500.00,
                "Alice Silva",
                "Rua Principal, 123"
        );

        controller.createOrder(
                "Smartphone",
                2,
                1500.00,
                "Carlos Oliveira",
                "Avenida Central, 45"
        );

        controller.createOrder(
                "Headset Gamer",
                1,
                300.00,
                "Beatriz Lima",
                "Rua das Flores, 789"
        );

        controller.createOrder(
                "Smartwatch",
                3,
                1200.00,
                "Marcos Souza",
                "Travessa Verde, 10"
        );

        controller.createOrder(
                "Monitor 4K",
                2,
                2000.00,
                "Fernanda Costa"
        );
    }
}
