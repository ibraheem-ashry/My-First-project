package com.crud.taskmanager.service.orderservice;

import com.crud.taskmanager.dao.orderdao.OrderDao;
import com.crud.taskmanager.dto.orderDTO.OrderRequestDTO;
import com.crud.taskmanager.dto.orderDTO.OrderResponseDTO;
import com.crud.taskmanager.dto.userDTO.UserResponseDTO;
import com.crud.taskmanager.entity.Order;
import com.crud.taskmanager.entity.User;
import com.crud.taskmanager.service.userservice.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderDao orderDao ;
    private final UserService userService;
    
    public OrderServiceImpl(OrderDao orderDao, UserService userService) {
        this.orderDao = orderDao;
        this.userService = userService;
    }


    @Override
    public OrderResponseDTO save(OrderRequestDTO orderRequestDTO) {


        UserResponseDTO userResponseDTO = userService.findById(orderRequestDTO.getUserId());

        User user = new User();
        user.setId(userResponseDTO.getId());
        Order order = new Order();

        order.setId(orderRequestDTO.getUserId());
        order.setProduct(orderRequestDTO.getProduct());
        order.setPrice(orderRequestDTO.getPrice());
        order.setUser(user);
        orderDao.save(order);

    OrderResponseDTO orderResponseDTO = new OrderResponseDTO();

     orderResponseDTO.setId(order.getId());
     orderResponseDTO.setProduct(orderRequestDTO.getProduct());
     orderResponseDTO.setPrice(orderRequestDTO.getPrice());
     orderResponseDTO.setUserId(orderRequestDTO.getUserId());

        return orderResponseDTO;
    }

    @Override
    public OrderResponseDTO findById(Long id) {

        Order order = orderDao.findById(id);
        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();

        orderResponseDTO.setProduct(order.getProduct());
        orderResponseDTO.setPrice(order.getPrice());
        orderResponseDTO.setUserId(order.getUser().getId());
        orderResponseDTO.setId(order.getId());
        return orderResponseDTO;
    }

    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    @Override
    public void delete(Long id) {
        orderDao.delete(id);
    }
}














