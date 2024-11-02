package org.example.commerces.controller;

import org.example.commerces.Service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OrderController {
    OrderService orderService;
}
