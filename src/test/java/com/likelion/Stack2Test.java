package com.likelion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack2Test {

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }

    @Test
    @DisplayName("push test")
    void push() {
        Stack2 st = new Stack2();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void pushAndPop() {
        Stack2 st = new Stack2();
        st.push(10);
        st.push(20);
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
        assertThrows(EmptyStackException.class,() -> {
            st.pop();
        });
    }

    @Test
    void isEmpty() {
        Stack2 st = new Stack2();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test
    void peek() {
        Stack2 st = new Stack2();
        assertThrows(EmptyStackException.class, ()-> {
            st.peek();
        });
        st.push(10);
        int peeked = st.peek();
        assertEquals(10, peeked);
    }
}