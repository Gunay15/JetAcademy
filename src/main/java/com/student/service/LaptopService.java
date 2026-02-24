package com.student.service;

import com.student.dao.entity.LaptopEntity;
import com.student.dao.repository.LaptopRepository;
import com.student.dto.LaptopDto;
import com.student.exception.ExceptionResponseDto;
import com.student.exception.LaptopException;
import com.student.mapper.LaptopMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.ResourceTransactionManager;

@Service
@RequiredArgsConstructor
public class LaptopService {
    private final LaptopRepository repository;
    private final LaptopMapper laptopMapper;

    public void create(LaptopDto dto){
        LaptopEntity entity=laptopMapper.dtoToEnt(dto);
        LaptopEntity saved=repository.save(entity);
    }

    public ResponseEntity<?> getLaptop(){

        return ResponseEntity.ok().body(repository.findAll().stream().map(laptopMapper::entToDto));
    }

    public ResponseEntity<?>getLaptopById(Long id){
        return ResponseEntity.ok().body(repository.findById(id).orElseThrow(()->new LaptopException("laptop tapilmadi")));

    }
}
