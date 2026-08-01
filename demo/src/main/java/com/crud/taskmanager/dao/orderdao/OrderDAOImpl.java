package com.crud.taskmanager.dao.orderdao;

import com.crud.taskmanager.dto.orderDTO.OrderResponseDTO;
import com.crud.taskmanager.entity.Order;
import com.crud.taskmanager.entity.User;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDAOImpl implements OrderDao {
    private final List<Order> orders = new ArrayList<>();


/*
    private final EntityManager entityManager;

    public OrderDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }*/


    @Override
    public Order save(Order order) {
        orders.add(order);
        return order;
    }

    @Override
    public Order findById(Long id) {
        for(Order order : orders){
            if(order.getId().equals(id)) {
                return order;
            }
        }
        return null ;
    }


    @Override
    public List<Order> findAll() {
        return orders;
    }

    @Override
    public void delete(Long id) {
        Order order = findById(id);
        if(order != null) {
            orders.remove(order);
        }
    }
}



















