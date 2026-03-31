package com.student.service;

import com.student.dto.BookDto1;
import com.student.feignclient.BookClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookClient client;

    public List<BookDto1> getBook(){
        List<BookDto1> books = client.getBooks();
        books.forEach(b->b.setPrice(b.getPrice()*1.1));
        return books;}

    public List<BookDto1> getBook1(String author){
        List<BookDto1> books = client.getBooks1(author);

        books.forEach(b->b.setPrice(b.getPrice()*1.1));
        return books;}

    public String addBook( BookDto1 request){
        return client.postBook(request);
    }



    public List<BookDto1> getBookk(String ownerType){
        List<BookDto1> book =client.getBoo(ownerType);
        return book;}


    public List<BookDto1> getOwner(String ownerType){
        List<BookDto1> books=client.getBoo(ownerType);
        List<BookDto1> dtos = new ArrayList<>();
        for(BookDto1 b : books){
            if(b.getStockCount()> 0){
                dtos.add(b);
            }
        }
        return dtos;
    }

    public List<BookDto1> getAuthor(String author){
        List<BookDto1> bookDto1s =client.getBooks1(author);
        return bookDto1s.stream().filter(b->b.getStockCount()!=null).toList();
    }











//    private final BookRepository bookRepository;
//    private final AuthorRepository authorRepository;
//    private final BookMapper bookMapper;
//
//    public List<BookResponseDto> getBooks(){
//        List<BookEntity> all = bookRepository.findAll();
//        return all.stream().map(BookMapper::entityToResponseDto).toList();
//    }
//
//    public void addBook(BookRequestDto dto){
//        bookRepository.save(bookMapper.bookDtoToEntity(dto));
//    }

}
