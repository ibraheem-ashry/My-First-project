package com.crud.taskmanager.dao.userdao;

import com.crud.taskmanager.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public  interface UserDao{

     User save(User user);

     User findById(Long id);

     List<User> findAll();

     void delete(Long id);
}
