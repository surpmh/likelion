package _1011.digits;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n == 0 ? 0 : 1 + ((n - 1) % 9);

//        while (true) {
//            sum = 0;
//            while (n != 0) {
//                sum += n % 10;
//                n /= 10;
//            }
//            if (sum / 10 == 0){
//                break;
//            } else {
//                n = sum;
//            }
//        }

        System.out.println(sum);
    }
}
