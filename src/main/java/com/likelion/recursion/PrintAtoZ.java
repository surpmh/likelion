package com.likelion.recursion;

public class PrintAtoZ {
    public static void printAlphabet1(char c) {
        if (c > 'Z') return;
        System.out.println(c);
        printAlphabet1((char)(c + 1));
    }

    public static void printAlphabet2(String s, int len){
        if (s.length() == len) {
            System.out.println(s);
            return;
        }
        for (char c='A'; c<='Z'; c++) {
            printAlphabet2(s+c, len);
        }

    }

    public static void main(String[] args) {
        printAlphabet1('A');
        printAlphabet2("", 2);
    }
}
