package com.student.mapper;

import com.student.dao.entity.CustomerEntity;
import com.student.dto.CustomerDto;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public CustomerEntity dtoTo(CustomerDto dto){
        return new  CustomerEntity(dto.getName(),dto.getSurname(),dto.getBalance());
    }

    public CustomerDto entTo(CustomerEntity ent){
        return new CustomerDto(ent.getName(), ent.getSurname(), ent.getBalance());
    }

}
