package com.likelion.bruteforce;

public class Eratos {
    public int solution(int n) {
        boolean[] prime = new boolean[n+1];
        int answer = 0;
        prime[0] = prime[1] = true;

        for(int i=2; i<=Math.sqrt(n)+1; i++) {
            if (prime[i] == false) {
                for(int j=i*i; j<=n; j+=i) {
                    prime[j] = true;
                }
            }
        }

        for(int i=0; i<=n; i++) {
            if (!prime[i]) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Eratos eratos = new Eratos();
        System.out.println(eratos.solution(10));
    }
}