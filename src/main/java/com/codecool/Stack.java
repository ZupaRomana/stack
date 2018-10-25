package com.codecool;

import com.codecool.exceptions.StackOverflow;
import com.codecool.exceptions.StackUnderflow;

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
        if (capacity == size) {
            throw new StackOverflow();
        } else {
            top = top == null ? new Node<>(element, null) : new Node<>(element, top);
            size++;
        }
    }

    public Element pop() {
        if (top == null) {
            throw new StackUnderflow();
        } else {
            size--;
            Element result = top.element;
            top = top.previousNode;
            return result;
        }
    }

    public Element peek() {
        return top == null ? null : top.element;
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
