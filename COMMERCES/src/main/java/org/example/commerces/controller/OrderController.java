package org.example.commerces.controller;

import org.example.commerces.Model.Order_model;
import org.example.commerces.Service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OrderController {
    OrderService orderService;
    @GetMapping("Id")
    public Order_model getOrderDetails(  @PathVariable ("Id") String Id) {
        return orderService.getOrder(Id);

    }
}
