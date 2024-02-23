package chuong3.phan5.baitap;

import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt(); // đọc vào số n
        var sum = 0.0;

        // tiến hành tính tổng
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
        }
        // kết quả:
        System.out.println(Math.round(sum));
    }
}