package com.student.exception;

public class NotFoundTitle extends RuntimeException {
    public NotFoundTitle(String message) {
        super(message);
    }
}
