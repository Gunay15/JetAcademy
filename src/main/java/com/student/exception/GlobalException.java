package com.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.security.PublicKey;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {

   /* @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handleValidationException(MethodArgumentNotValidException ex) {

        Map<String, Object> errors = new HashMap<>();
        errors.put("timestamp", LocalDateTime.now());
        errors.put("status", HttpStatus.BAD_REQUEST.value());

        Map<String, String> fieldErrors = new HashMap<>();
        ex.getBindingResult().getFieldErrors()
                .forEach(error -> fieldErrors.put(error.getField(), error.getDefaultMessage()));

        errors.put("errors", fieldErrors);

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
*/
    @ExceptionHandler(LaptopException.class)
    public ExceptionResponseDto notFound(LaptopException ex){
        return new ExceptionResponseDto(HttpStatus.NOT_FOUND,ex.getMessage());
    }

    @ExceptionHandler(NotFoundTitle.class)
    public JournalExceptionDto notTitle(NotFoundTitle ex){
        return new JournalExceptionDto(HttpStatus.NOT_FOUND,ex.getMessage());
    }
    @ExceptionHandler(NotFoundAuthor.class)
    public JournalExceptionDto notAuthor(NotFoundAuthor ex){
        return new JournalExceptionDto(HttpStatus.NOT_FOUND,ex.getMessage());
    }

    @ExceptionHandler(NotFoundPrice.class)
    public JournalExceptionDto notPrice(NotFoundPrice ex){
        return new JournalExceptionDto(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(NotFoundCount.class)
    public JournalExceptionDto notCount(NotFoundCount ex){
        return new JournalExceptionDto(HttpStatus.BAD_REQUEST,ex.getMessage());
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
     public ResponseEntity<?> notValid(MethodArgumentNotValidException exception){
      Map<String,Object> map=  new HashMap<>();
       exception.getBindingResult().getFieldErrors().forEach(e->map.put(e.getField(),e.getDefaultMessage()));
        return  ResponseEntity.badRequest().body(map);
    }

    @ExceptionHandler(UserException.class)
    public UserExceptionDto notAge(UserException ex){
        return new UserExceptionDto(HttpStatus.BAD_REQUEST,ex.getMessage());
    }

}
