package com.example.EventManager.manages.Mapper;

import com.example.EventManager.manages.dto.UserDTO;
import com.example.EventManager.manages.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO mapToDto(User user);

    User mapToEntity(UserDTO userDTO);

    List<UserDTO> mapToDto(List<User> userList);

    List<User> mapToEntity(List<UserDTO> userDTOList);
}
