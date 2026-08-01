package com.crud.taskmanager.service.userservice;

import com.crud.taskmanager.dao.userdao.UserDao;
import com.crud.taskmanager.dto.userDTO.UserRequestDto;
import com.crud.taskmanager.dto.userDTO.UserResponseDTO;
import com.crud.taskmanager.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

   private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public UserResponseDTO save(UserRequestDto userRequestDto) {

        User user = new User();
        user.setId(userRequestDto.getId());
        user.setName(userRequestDto.getName());
        user.setEmail(userRequestDto.getEmail());
        userDao.save(user);

        UserResponseDTO userResponseDto = new UserResponseDTO();

        userResponseDto.setId(userRequestDto.getId());
        userResponseDto.setName(userRequestDto.getName());
        userResponseDto.setEmail(userRequestDto.getEmail());
        return userResponseDto;
    }

    @Override
    public UserResponseDTO findById(Long id) {

       User user = userDao.findById(id);

        if(user == null){
            throw new RuntimeException("user not found");
        }
       UserResponseDTO userResponseDto = new UserResponseDTO();
        userResponseDto.setId(user.getId());
        userResponseDto.setName(user.getName());
        userResponseDto.setEmail(user.getEmail());
       return userResponseDto;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void delete(Long id) {

        userDao.delete(id);
    }
}
