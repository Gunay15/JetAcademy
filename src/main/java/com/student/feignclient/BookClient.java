package com.student.feignclient;

import com.student.dto.BookDto1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name="book-service",url = "http://jet.olsun.in/v1/book-jet")
public interface BookClient {
    @GetMapping("/get")
    List<BookDto1> getBooks();

    @GetMapping("/get/{author}")
    List<BookDto1> getBooks1(@PathVariable String author);


    @PostMapping("/add")
    String postBook(BookDto1 request);

    @GetMapping("/get-owner/{ownerType}")
    List<BookDto1> getBoo(@PathVariable String ownerType);


}
