package com.student.controller;

import com.student.dto.PersonDto;
import com.student.dao.entity.ChildPersonEntity;
import com.student.dao.entity.PersonEntity;
import com.student.dao.repository.ChildPersonRepository;
import com.student.dao.repository.PersonRepository;
import com.student.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;
    private final ChildPersonRepository childPersonRepository;
    private final PersonService personService;

    @PostMapping("/add")
    public String add(@RequestBody PersonEntity e){
        if(e.getAge()<18){
            childPersonRepository.save(new ChildPersonEntity(e.getName(),e.getSurname(),e.getAge()));
        } else personRepository.save(e) ;
        return "istifadeci elave edildi";
    }
   @GetMapping("/gett")
   public List<PersonEntity> getList(){

        return personRepository.findAll();
    }

    @GetMapping("/get-max-age")
    public PersonEntity gettAge(){

        List<PersonEntity> list = personRepository.findAll();
        List<PersonEntity> l1 = list.stream().sorted(Comparator.comparing(PersonEntity::getAge).reversed()).toList();
        PersonEntity p = null;

       for(PersonEntity e : l1){
           p = e;
           break;
       }
       return p;
    }
    @PostMapping("/add-person")
    public void addStudent(@RequestBody PersonDto dto){
        personService.addPerson(dto);

    }
}
