package com.student.controller;

import com.student.dto.LaptopDto;
import com.student.service.LaptopService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class LaptopController {
    private final LaptopService laptopService;

    @PostMapping("/laptops")

    public void createLaptop(@Valid @RequestBody LaptopDto dto) {
        laptopService.create(dto);

}

@GetMapping("/get/{id}")
public ResponseEntity<?> getLaptopById(@PathVariable Long id){
        return laptopService.getLaptopById(id);
}
}
