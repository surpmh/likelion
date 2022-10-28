package com.likelion.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    void solution() {
        Pokemon pokemon = new Pokemon();
        int[] arr = {3, 1, 2, 3};
        Assertions.assertEquals(2, pokemon.solution(arr));
    }
}