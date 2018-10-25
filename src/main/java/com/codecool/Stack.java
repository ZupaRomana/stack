package com.codecool;

public class Stack<Element> {

    private int size;

    public Stack(int size) throws IllegalArgumentException {
        if (wrongSize(size)) {
            throw new IllegalArgumentException();
        } else {

        }
    }

    private boolean wrongSize(int size) {
        return size < 0;
    }

    public int getSize() {
        return size;
    }
}
