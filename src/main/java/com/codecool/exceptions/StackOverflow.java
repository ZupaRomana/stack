package com.codecool.exceptions;

public class StackOverflow extends RuntimeException {
    public StackOverflow() {
        super();
    }

    public StackOverflow(String message) {
        super(message);
    }
}
