package com.likelion.hash;

import java.util.HashMap;

class Player {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> players = new HashMap<>();
        String answer = "";

        for (String p : participant) {
            players.put(p, players.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            players.put(c, players.get(c) - 1);
        }

        for (String key : players.keySet()) {
            if (players.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Player player = new Player();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(player.solution(participant, completion));
    }
}
