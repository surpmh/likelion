package com.likelion.hash;

import java.util.HashSet;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();

        for (String number : phone_book) {
            set.add(number);
        }

        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {
                if (set.contains(number.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
