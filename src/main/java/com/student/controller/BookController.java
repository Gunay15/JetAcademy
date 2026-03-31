package com.student.controller;

import com.student.dto.BookDto1;
import com.student.feignclient.BookClient;
import com.student.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/book")
public class BookController {

    private final BookClient bookClient;
    private final BookService bookService;

    @GetMapping
    List<BookDto1>getBook(){
       return bookService.getBook();
    }

    @GetMapping("/{author}")
    List<BookDto1>getBook1(@PathVariable String author){
        return bookService.getBook1(author);
    }

    @PostMapping
    public String addBook(@RequestBody BookDto1 request){
     return bookService.addBook(request);
    }

    @GetMapping("my-book")
    public List<BookDto1> myBooks(){
        return bookService.getBookk("Massimo");
    }


    @GetMapping("/my-owner/{ownerType}")
    public List<BookDto1> myOwner(@PathVariable String ownerType){
        return bookService.getOwner(ownerType);
    }

    @GetMapping("/author/{author}")
    public List<BookDto1> my(@PathVariable String author){
        return bookService.getAuthor(author);
    }
}
