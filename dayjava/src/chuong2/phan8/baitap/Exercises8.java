package chuong2.phan8.baitap;

import java.util.Scanner;

public class Exercises8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var r = input.nextDouble(); // đọc r
        // tính chu vi
        var perimeter = 2 * Math.PI * r;
        // tính diện tích
        var area = Math.PI * r * r;
        // hiện kết quả:
        System.out.println(Math.round(perimeter));
        System.out.println(Math.round(area));
    }
}