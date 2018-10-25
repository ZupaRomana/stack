package com.codecool.exceptions;

public class StackUnderflow extends RuntimeException {
    public StackUnderflow() {
        super();
    }

    public StackUnderflow(String message) {
        super(message);
    }
}
