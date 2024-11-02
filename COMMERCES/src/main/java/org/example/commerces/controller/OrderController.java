package org.example.commerces.controller;

import org.example.commerces.Model.Order_model;
import org.example.commerces.Service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class OrderController {
    OrderService orderService;
    @GetMapping("Id")
    public Order_model getOrderDetails(  @PathVariable ("Id") String Id) {
        return orderService.getOrder(Id);

    }
    @GetMapping
    public List<Order_model> getAllOrders() {
        return orderService.getAllOrders();
    }
    @PostMapping
    public String createOrderDetails(@RequestBody Order_model order_model) {
        orderService.createOrder(order_model);
        return "Order created successfully";
    }
}
