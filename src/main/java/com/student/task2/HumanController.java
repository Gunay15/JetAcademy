package com.student.task2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class HumanController {
    private final HumanService humanService;
    @GetMapping("/get-human")
    public List<HumanDto> getHuman(){
        return humanService.findHuman();
    }
//    @PostMapping("/add-human")
//    public void addHuman(HumanDto dto){
//        humanService.;
//    }
    @GetMapping("/gettt-id/{id}")
    public HumanDto getId(@PathVariable Long id){
        return humanService.findId(id);
    }

    @GetMapping("/gettt-age/{age}")
    public List<HumanDto> getAge(@PathVariable Integer age){
        return humanService.findAge(age);
    }

    @GetMapping("/gettt-name/{name}")
    public List<HumanDto> getName(@PathVariable String name){
        return humanService.findName(name);
    }
}
