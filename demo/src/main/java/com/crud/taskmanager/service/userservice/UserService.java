package com.crud.taskmanager.service.userservice;

import com.crud.taskmanager.dto.userDTO.UserRequestDto;
import com.crud.taskmanager.dto.userDTO.UserResponseDTO;
import com.crud.taskmanager.entity.User;

import java.util.List;


public interface UserService {

   UserResponseDTO save(UserRequestDto userRequestDto);

   UserResponseDTO findById(Long id);

   List<User> findAll();

   void delete (Long id);

}
