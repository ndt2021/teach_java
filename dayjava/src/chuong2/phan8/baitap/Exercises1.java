package chuong2.phan8.baitap;

import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) {
        int n;
        var input = new Scanner(System.in);
        n = input.nextInt(); // đọc n vào từ keyboard
        int absN = Math.abs(n); // lấy trị tuyệt đối của n
        System.out.println(absN);
    }
}