package com.springboot.hospitalapi.parser;

public interface Parser <T> {
    T parse(String str);
}
