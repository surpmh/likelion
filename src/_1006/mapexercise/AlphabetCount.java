package _1006.mapexercise;

import java.util.HashMap;
import java.util.Scanner;

public class AlphabetCount {
    public static boolean isAlphabet(char c) {
        return (c >= 'a' && c <= 'z');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();
        str = str.toLowerCase();    // 모두 소문자로 변환
        HashMap<Character, Integer> alphabet = new HashMap<>();

        // 알파벳 소문자를 key에 저장
        for (char i='a'; i<='z'; i++) {
            alphabet.put(i, 0);
        }

        // 알파벳 개수 세기
        for (int i=0; i < str.length(); i++) {
            if (isAlphabet(str.charAt(i))) {
                alphabet.put(str.charAt(i), alphabet.get(str.charAt(i)) + 1);
            }
        }

        // 출력하기
        for (Character key: alphabet.keySet()) {
            System.out.println(key + ": " + alphabet.get(key));
        }

    }
}
