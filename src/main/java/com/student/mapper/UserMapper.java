package com.student.mapper;

import com.student.dao.entity.UserEntity;
import com.student.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserEntity dtoTo(UserDto dto){
        return new UserEntity(dto.getUsername(), dto.getSurname(), dto.getAge());
    }
}
