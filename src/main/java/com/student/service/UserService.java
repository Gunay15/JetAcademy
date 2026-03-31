package com.student.service;

import com.student.dao.entity.UserEntity;
import com.student.dao.repository.UserRepository;
import com.student.dto.UserDto;
import com.student.mapper.UserMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Transactional
    public void create(UserDto dto){
        var user=userMapper.dtoTo(dto);
        userRepository.save(user);
        if(dto.getAge()<18) throw new RuntimeException("Yasiniz 18-den kicikdir");
    }
}
