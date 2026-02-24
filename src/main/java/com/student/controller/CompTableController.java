package com.student.controller;

import com.student.dto.CompTableRequestDto;
import com.student.dto.CompTableResponseDto;
import com.student.service.CompTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor

public class CompTableController {
    private final CompTableService compTableService;

    @PostMapping("/comp")
    public void getComp(@RequestBody CompTableRequestDto e){
        compTableService.addComp(e);
    }
    @GetMapping("/compp/")
    public CompTableResponseDto getById(@RequestParam Long id){
        return compTableService.getComp(id);
    }
}
