package com.codecool;

public class Stack<Element> {

    private int size;

    public Stack(int size) throws IllegalArgumentException {
        if (wrongSize(size)) {
            throw new IllegalArgumentException();
        } else {
            this.size = size;
        }
    }

    private boolean wrongSize(int size) {
        return size < 0;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Element e : container) {
            sb.append(" ").append(e);
        }
        return sb.toString();
    }
}
