package com.student.PhoneStoreTask;

import org.springframework.stereotype.Component;

@Component
public class PhoneMapper {
    public PhoneEntity entToDto(PhoneDto dto){
        return new PhoneEntity(dto.getBrand(),dto.getModel(),dto.getColor(),dto.getPrice());
    }


}
