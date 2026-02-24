package com.student.exception;

public class NotFoundAuthor extends RuntimeException {
    public NotFoundAuthor(String message) {
        super(message);
    }
}
