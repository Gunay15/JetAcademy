package com.student.task4;

import org.springframework.stereotype.Component;

@Component
public class RoomMapper {
    public RoomEntity entToDto(RoomDto dto){
        return new RoomEntity(dto.getName(),dto.getChair(), dto.getTable());
    }
}
