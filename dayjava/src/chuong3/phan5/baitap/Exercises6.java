package chuong3.phan5.baitap;

import java.util.Scanner;

public class Exercises6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt(); // nhập vào số n
        boolean isPrime = true; // giả sử rằng n là số n.tố

        if (n < 2) { // mọi số < 2 k ng.tố
            isPrime = false; // n k phải số nguyên tố
        } else {
            // kiểm tra các giá trị từ 2 ->  bậc 2 của n là đủ
            int bound = (int) Math.sqrt(n);
            for (int i = 2; i <= bound; i++) {
                if (n % i == 0) {
                    isPrime = false; // n k phải số ng.tố
                }
            }
        }
        if (isPrime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}