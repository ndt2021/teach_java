package chuong2.phan8.baitap;

import java.util.Scanner;

public class Exercises10 {
    public static void main(String[] args) {
        // Nhập vào độ dài ba cạnh tam giác:
        Scanner input = new Scanner(System.in);
        var a = input.nextDouble();
        var b = input.nextDouble();
        var c = input.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            // tính p:
            var p = 0.5d * (a + b + c);

            // tính diện tích:
            var area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println(Math.round(area));
        }
    }
}