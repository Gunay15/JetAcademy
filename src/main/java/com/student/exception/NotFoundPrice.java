package com.student.exception;

public class NotFoundPrice extends RuntimeException {
    public NotFoundPrice(String message) {
        super(message);
    }
}
