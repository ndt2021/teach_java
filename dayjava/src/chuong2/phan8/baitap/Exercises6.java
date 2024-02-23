package chuong2.phan8.baitap;

import java.util.Scanner;

public class Exercises6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        var a = input.nextInt(); // đọc a
        var b = input.nextInt(); // đọc b

        var result1 = Math.pow(a, b); // tính a^b
        var result2 = Math.pow(b, a); // tính b^a

        System.out.println(result1);
        System.out.println(result2);
    }
}