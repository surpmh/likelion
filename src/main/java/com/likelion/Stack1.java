package com.likelion;

public class Stack1 {
    private int[] arr;
    private int pointer = 0;

    public Stack1(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[this.pointer] = value;
        this.pointer++;
    }

    public int pop() {
        return this.arr[--this.pointer];
    }

    public int[] getArr() {
        return arr;
    }
}
