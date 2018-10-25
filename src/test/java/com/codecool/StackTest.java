package com.codecool;

import com.codecool.exceptions.StackOverflow;
import com.codecool.exceptions.StackUnderflow;
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

    @Test
    void hasValidSize_when_pushedMaxItems() {
        Stack<String> stack = new Stack<>(5);
        for (int i = 0; i < 5; i++) {
            stack.push("example");
        }

        int expected = 5;
        int actual = stack.getSize();

        assertEquals(expected, actual);
    }

    @Test
    void throwsException_when_pushedMoreThanSizeItems() {
        Stack<String> stack = new Stack<>(10);
        int capacity = stack.getCapacity();

        for (int i = 0; i < capacity; i++) {
            stack.push("example");
        }

        assertThrows(StackOverflow.class, () -> {
            stack.push("StackOverflow");
        });
    }

    @Test
    void returnsValidFreeSpace_when_stackFull() {
        Stack<String> stack = new Stack<>(2);
        stack.push(" ");
        stack.push(" ");

        int expected = 0;
        int actual = stack.getFreeSpace();

        assertEquals(expected, actual);
    }

    @Test
    void returnsElement_when_popOnLastItem() {
        Stack<String> stack = new Stack<>(2);
        stack.push("ex");
        stack.push("example");

        String expected = "example";
        String actual = stack.pop();

        assertEquals(expected, actual);
    }

    @Test
    void throwsException_when_stackIsEmpty() {
        Stack<String> stack = new Stack<>(5);
        assertThrows(StackUnderflow.class, () -> {
            stack.pop();
        });
    }

    @Test
    void returnsValidObject_when_popedMoreTimes() {
        Stack<String> stack = new Stack<>(4);
        stack.push("1");
        stack.push("2");

        String expected = "1";
        stack.pop();
        String actual = stack.pop();

        assertEquals(expected, actual);
    }
}