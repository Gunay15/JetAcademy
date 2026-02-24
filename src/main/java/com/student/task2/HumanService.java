package com.student.task2;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HumanService {
    private final HumanRepository humanRepository;
    private final ResourcePatternResolver resourcePatternResolver;

    public List<HumanDto> findHuman(){
        return humanRepository.findHuman();
    }
//    public HumanEntity addHuman(HumanDto dto){
//          humanRepository.save(dto);
//    }

    public HumanDto findId(Long id){
        return humanRepository.findId(id);
    }
    public List<HumanDto> findAge(Integer age){
        return humanRepository.findAge(age);
    }
    public List<HumanDto> findName(String name){
        return humanRepository.findName(name);
    }
}
