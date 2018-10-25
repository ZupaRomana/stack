package com.codecool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void throwsException_when_wrongCapacityPassed() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Stack<String>(-1);
        });
    }

    @Test
    void doesNotThrowException_when_goodCapacityPassed() {
        assertDoesNotThrow(() -> {
            new Stack<String>(30);
        });
    }

    @Test
    void returnsValidCapacity() {
        Stack<String> stack = new Stack<>(19);

        int expected = 19;
        int actual = stack.getCapacity();

        assertEquals(expected, actual);
    }

    @Test
    void returnsValidSize_when_noObjectPushed() {
        Stack<String> stack = new Stack<>(10);

        int expected = 0;
        int actual = stack.getSize();

        assertEquals(expected, actual);
    }

    @Test
    void returnsValidNumOfFreeSpaces() {
        Stack<String> stack = new Stack<>(5);

        int expected = 5;
        int actual = stack.getFreeSpace();

        assertEquals(expected, actual);
    }

    @Test
    void hasValidSize_when_pushedOneItem() {
        Stack<String> stack = new Stack<>(5);
        stack.push("example");

        int expected = 1;
        int actual = stack.getSize();

        assertEquals(expected, actual);
    }

    @Test
    void hasValidSize_when_pushedMoreItems() {
        Stack<String> stack = new Stack<>(5);
        for (int i = 0; i < 3; i++) {
            stack.push("example");
        }

        int expected = 3;
        int actual = stack.getSize();

        assertEquals(expected, actual);
    }
}