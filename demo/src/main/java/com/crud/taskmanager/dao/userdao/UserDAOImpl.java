package com.crud.taskmanager.dao.userdao;

import com.crud.taskmanager.entity.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDAOImpl implements UserDao{
    private final List<User> users = new ArrayList<>();

    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }
    @Override
    public User findById(Long id) {
        for(User user : users){
            if(id.equals(user.getId())){
                return user;
            }
        }
        return null;
    }
    @Override
    public List<User> findAll() {
        return users;
    }
    @Override
    public void delete(Long id) {
        User user = findById(id);
        users.remove(user);
    }
}
