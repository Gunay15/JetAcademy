package com.student.mapper;

import com.student.dto.BookRequestDto;
import com.student.dto.BookResponseDto;
import com.student.dao.entity.AuthorEntity;
import com.student.dao.entity.BookEntity;
import com.student.dao.repository.AuthorRepository;
import com.student.dao.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BookMapper {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
  public static BookResponseDto entityToResponseDto(BookEntity b){
      return new BookResponseDto(b.getTitle());
  }
  public static List<BookResponseDto> entityToResponseDtoList(List<BookEntity> b){
      return b.stream().map(BookMapper::entityToResponseDto).toList();
  }

    public BookEntity bookDtoToEntity(BookRequestDto dto){
        AuthorEntity author = authorRepository.findById(dto.getAuthorId()).orElseThrow(
                () -> new RuntimeException("salam")
        );
        return new BookEntity(dto.getTitle(),author);
    }

}
