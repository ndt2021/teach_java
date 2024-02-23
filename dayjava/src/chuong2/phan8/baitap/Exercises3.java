package chuong2.phan8.baitap;

import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var x = input.nextDouble(); // đọc vào số x
        var sinX = Math.sin(Math.toRadians(x));
        var cosX = Math.cos(Math.toRadians(x));
        var tanX = Math.tan(Math.toRadians(x));
        // hiện kết quả:
        System.out.println("sin(" + x + ") = " + sinX);
        System.out.println("cos(" + x + ") = " + cosX);
        System.out.println("tan(" + x + ") = " + tanX);
    }
}