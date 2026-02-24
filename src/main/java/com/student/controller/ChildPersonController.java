package com.student.controller;


import com.student.dao.repository.ChildPersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChildPersonController {
    private final ChildPersonRepository childPersonRepository;

//    @PostMapping("/add/")
//    public String adding(@RequestBody ChildPersonEntity c){
//        if(c.getAge()>18){
//            return "18den boyuk olmaz";
//        }
//    }
}
