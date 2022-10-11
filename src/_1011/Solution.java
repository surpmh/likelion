package _1011;

//public class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        String s = String.valueOf(n);
//
//        for (int i=0; i<s.length(); i++) {
//            answer += Integer.parseInt(String.valueOf(s.charAt(i)));
//        }
//
//        return answer;
//    }
//}

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}