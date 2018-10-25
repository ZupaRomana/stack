package com.codecool;

public class Stack<Element> {

    public Stack(int size) throws IllegalArgumentException {
        if (wrongSize(size)) {
            throw new IllegalArgumentException();
        } else {

        }
    }

    private boolean wrongSize(int size) {
        return size < 0;
    }
}
