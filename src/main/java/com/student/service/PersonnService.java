package com.student.service;

import com.student.dao.repository.PersonnRepositoriy;
import com.student.dto.PersDto;
import com.student.dto.PersonnDto;
import com.student.mapper.PersonnMap;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonnService {
    private final PersonnRepositoriy personnRepositoriy;
    private final PersonnMap personnMap;

    public List<PersonnDto> method(){
        return personnRepositoriy.findAlls();
    }

    public PersonnDto meth(Long id){
        return personnRepositoriy.findByIds(id);
    }

    public List<PersonnDto> mett(String name,Integer age){
        return personnRepositoriy.findNameAge(name,age);
    }

    public void meet(String name,Integer age){
         personnRepositoriy.update(name,age);
    }

    public void me(Integer age){
        personnRepositoriy.delete(age);
    }
    public Long count(){
        return personnRepositoriy.say();
    }
    public List<PersDto> c(){
        return personnRepositoriy.group();
    }
}
