package org.example.lombok.view;

import org.example.lombok.model.Order;

public class OrderView {
    private int orderCount = 0;

    public void displayOrder(Order order) {
        orderCount++;
        System.out.println("\n=====================================");
        System.out.println("          ORDER DETAILS - " + orderCount);
        System.out.println(order);
    }
}