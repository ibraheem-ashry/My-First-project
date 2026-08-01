package com.crud.taskmanager.dao.orderdao;

import com.crud.taskmanager.entity.Order;

import java.util.List;

public interface OrderDao {



    Order save(Order order);

    Order findById(Long id);

    List<Order> findAll();

    void delete(Long id);


}
