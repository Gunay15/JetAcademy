package com.student.service;

import com.student.dto.BookRequestDto;
import com.student.dto.BookResponseDto;
import com.student.dao.entity.BookEntity;
import com.student.mapper.BookMapper;
import com.student.dao.repository.AuthorRepository;
import com.student.dao.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final BookMapper bookMapper;

    public List<BookResponseDto> getBooks(){
        List<BookEntity> all = bookRepository.findAll();
        return all.stream().map(BookMapper::entityToResponseDto).toList();
    }

    public void addBook(BookRequestDto dto){
        bookRepository.save(bookMapper.bookDtoToEntity(dto));
    }

}
