package chuong2.phan8.baitap;

import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt(); // đọc n vào từ keyboard
        var sqrtN = Math.sqrt(n); // lấy căn bậc hai của n
        var cbrtN = Math.cbrt(n);
        System.out.println(sqrtN);
        System.out.println(cbrtN);
    }
}