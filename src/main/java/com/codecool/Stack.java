package com.codecool;

public class Stack<Element> {

    private int capacity;
    private int size;
    private Element top;
    private Element beforeTop;

    public Stack(int capacity) throws IllegalArgumentException {
        if (wrongSize(capacity)) {
            throw new IllegalArgumentException();
        } else {
            this.capacity = capacity;
            size = 0;
        }
    }

    private boolean wrongSize(int capacity) {
        return capacity < 0;
    }

    public int getCapacity() {
        return capacity;
    }
}
