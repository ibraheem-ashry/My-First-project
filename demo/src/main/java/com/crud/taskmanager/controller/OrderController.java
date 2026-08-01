package com.crud.taskmanager.controller;

import com.crud.taskmanager.dto.orderDTO.OrderRequestDTO;
import com.crud.taskmanager.dto.orderDTO.OrderResponseDTO;
import com.crud.taskmanager.entity.Order;
import com.crud.taskmanager.service.orderservice.OrderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/order")

public class OrderController {
    private final OrderService orderService;

        public OrderController(OrderService orderService) {
            this.orderService = orderService;
    }


    @PostMapping("/new")
        public void createOrder(@RequestBody OrderRequestDTO orderRequestDTO) {
            orderService.save(orderRequestDTO);

    }

    @GetMapping
        public List<Order> getAllOrder() {
            return orderService.findAll();
    }


    @GetMapping("/{id}")
        public OrderResponseDTO getById(@PathVariable Long id){
            return  orderService.findById(id);
        }


    @DeleteMapping("/{id}")
        public void deleteOrder(@PathVariable Long id){
            orderService.delete(id);
    }


}







