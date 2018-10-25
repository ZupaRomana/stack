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
}