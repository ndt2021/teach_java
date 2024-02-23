package chuong2.phan8.baitap;

import java.util.Scanner;

public class Exercises9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var c = input.nextInt();
        var alpha = input.nextInt();
        // tìm cạnh đối góc alpha
        var a = c * Math.sin(Math.toRadians(alpha));
        // tìm cạnh kề góc alpha
        var b = c * Math.cos(Math.toRadians(alpha));
        // tính chu vi, diện tích của tam giác:
        var perimeter = a + b + c;
        var area = 0.5 * a * b;
        // hiện kết quả
        System.out.println(Math.round(perimeter));
        System.out.println(Math.round(area));
    }
}