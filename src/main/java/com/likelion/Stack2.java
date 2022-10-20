package com.likelion;

import java.util.EmptyStackException;

public class Stack2 {
    private Integer[] arr;
    private int top = 0;

    public Stack2() {
        this.arr = new Integer[10000];
    }

    public Stack2(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value) {
        this.arr[top++] = value;
    }

    public int pop() {
        if (this.isEmpty()) {
//            throw new RuntimeException("스택이 비었습니다.");
            throw new EmptyStackException();
        }
        return this.arr[--this.top];
    }

    public Integer[] getArr() {
        return arr;
    }

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }

    public int peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[this.top-1];
    }
}
