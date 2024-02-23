package chuong2.phan8.baitap;

import java.util.Scanner;

public class Exercises4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var a = input.nextInt(); // đọc a
        var b = input.nextInt(); // đọc b
        // tìm min, max và hiện ra màn hình luôn
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));
    }
}