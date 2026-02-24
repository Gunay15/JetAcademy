package com.student.mapper;

import com.student.dao.entity.JournalEntity;
import com.student.dto.JournalDto;
import org.springframework.stereotype.Component;

@Component
public class JournalMapper {
    public JournalEntity entToDto(JournalDto dto){
        return new JournalEntity(dto.getTitle(), dto.getAuthor(), dto.getPrice(), dto.getCount());
    }

    public JournalDto dtoToEnt(JournalEntity entity){
        return new JournalDto(entity.getTitle(), entity.getAuthor(), entity.getPrice(), entity.getCount());
    }
}
//parametr hansi olacagsa metod adi ona uygun basliyacag.Meselen:entity dto ya cevirikse
//parametr kimi dto otururuk ve metod adi dtoToEntity olur



