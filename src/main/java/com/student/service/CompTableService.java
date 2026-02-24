package com.student.service;

import com.student.dto.CompTableRequestDto;
import com.student.dto.CompTableResponseDto;
import com.student.mapper.CompTableMapper;
import com.student.dao.repository.CompTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompTableService {
    private final CompTableRepository compTableRepository;
    private final CompTableMapper compTableMapper;
    public void addComp(CompTableRequestDto dtos){
        var comp=compTableMapper.compTableDto(dtos);
        compTableRepository.save(comp);
    }
    public CompTableResponseDto getComp(Long id){
       return compTableMapper.entityToDtoComp(compTableRepository.findById(id).get());

    }

}
