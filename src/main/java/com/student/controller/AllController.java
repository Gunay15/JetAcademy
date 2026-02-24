package com.student.controller;

import com.student.dao.entity.StudentEntity;
import com.student.dao.repository.StudentRepository;
import com.student.dto.*;
import com.student.dto.library.DtoAuthor;
import com.student.service.AuthorService;
import com.student.service.BookService;
import com.student.service.PersonnService;
import com.student.service.ServiceAuthor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class AllController {
    private final AuthorService service;
    private final BookService service1;
    private final StudentRepository studentRepository;
    private final PersonnService personnService;

    private final ServiceAuthor serviceAuthor;
    @GetMapping("/author/get")
    public List<DtoAuthor> getAuthor() {
        return serviceAuthor.getAuthors();
    }


    @GetMapping("/get-authors")
    public List<AuthorResponseDto> getAuthors() {
        return service.getAuthors();
    }

    @PostMapping("/add-author")
    public void addAuthor(@RequestBody AuthorResponseDto dto) {
        service.addAuthor(dto);
    }

    @GetMapping("/get-books")
    public List<BookResponseDto> getBooks() {

        return service1.getBooks();
    }

    @PostMapping("/add-book")
    public void addBook(@RequestBody BookRequestDto dto) {
        service1.addBook(dto);
    }

    @PostMapping("/add-studentt")
    public StudentEntity addStuden(@RequestBody StudentEntity student) {
        return studentRepository.save(student);

    }

    @GetMapping("/gett-person")
    public List<PersonnDto> getGetir() {
        return personnService.method();
    }

    @GetMapping("/get-id/{id}")
    public PersonnDto gettget(@PathVariable Long id) {
        return personnService.meth(id);
    }

    @GetMapping("/get-gel/{name}/{age}")
    public List<PersonnDto> ggg(@PathVariable String name, @PathVariable Integer age) {
        return personnService.mett(name, age);
    }

    @PatchMapping("/update/{name}/{age}")
    public void gun(@PathVariable String name, @PathVariable Integer age) {
        personnService.meet(name, age);
    }

    @PatchMapping("/delete/{age}")
    public void gu(@PathVariable Integer age) {
        personnService.me(age);
    }

    @GetMapping("/count")
    public Long cou() {
        return personnService.count();
    }

    @GetMapping("/con")
    public List<PersDto> gg() {
        return personnService.c();
    }
}
