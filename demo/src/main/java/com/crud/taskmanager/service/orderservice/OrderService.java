package com.crud.taskmanager.service.orderservice;

import com.crud.taskmanager.dto.orderDTO.OrderRequestDTO;
import com.crud.taskmanager.dto.orderDTO.OrderResponseDTO;
import com.crud.taskmanager.entity.Order;

import java.util.List;

public interface OrderService {

    OrderResponseDTO save(OrderRequestDTO orderRequestDTO);

    OrderResponseDTO findById(Long id);

    List<Order> findAll();

    void delete (Long id);
}
