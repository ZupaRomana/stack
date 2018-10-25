package com.codecool;

public class Stack<Element> {

    private int capacity;
    private int size;
    private Node<Element> top;

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

    public int getSize() {
        return size;
    }

    public int getFreeSpace() {
        return capacity - size;
    }

    public void push(Element element) {
        top = top == null ? new Node<>(element, null) : new Node<>(element, top);
        size++;
    }

    private class Node<E> {

        private E element;
        private Node<E> previousNode;

        Node(E element, Node<E> previousNode) {
            this.element = element;
            this.previousNode = previousNode;
        }
    }
}
