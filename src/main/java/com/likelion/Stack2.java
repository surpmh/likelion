package com.likelion;

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
        return this.arr[--this.top];
    }

    public Integer[] getArr() {
        return arr;
    }
}
