package org.example.commerces.Service;

import org.example.commerces.Model.Order_model;

import java.util.List;

public interface OrderService {
    void createOrder(Order_model order_model);
    void updateOrder(Order_model order_model);
    void deleteOrder(String order_id);
    Order_model getOrder(String order_id);
    List<Order_model> getAllOrders();
}
