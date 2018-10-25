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
    void returnsValidSize() {
        Stack<String> stack = new Stack<>(19);

        int expected = 19;
        int actual = stack.getSize();

        assertEquals(expected, actual);
    }

    @Test
    void returnsListInStringType() {
        Stack<String> stack = new Stack<>(3);

        String expected = " null null null";
        String actual = stack.toString();

        assertEquals(expected, actual);
    }
}