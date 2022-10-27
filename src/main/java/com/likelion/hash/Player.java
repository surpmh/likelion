package com.likelion.hash;

import java.util.HashMap;

class Player {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> players = new HashMap<>();

        for (String key : participant) {
            players.put(key, 1);
        }

        for (String key : completion) {
            players.put(key, 0);
        }

        for (String key : players.keySet()) {
            if (players.get(key) == 1) {
                return key;
            }
        }
        return "";
    }
}
