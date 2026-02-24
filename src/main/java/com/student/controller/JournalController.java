package com.student.controller;

import com.student.dto.JournalDto;
import com.student.mapper.JournalMapper;
import com.student.service.JournalService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class JournalController {
    private final JournalService journalService;
    private final JournalMapper journalMapper;

//    @PostMapping("/journal")
//    public void addJournal(@RequestBody JournalDto dto){
//        journalService.addJournal(dto);
//    }

    @PostMapping("/jour")
    public void addjour(@Valid @RequestBody JournalDto dto){
        journalService.addJour(journalMapper.entToDto(dto));
    }
}
