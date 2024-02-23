package chuong3.phan5;

import java.util.Scanner;

public class Lesson35 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương n: ");
        var n = input.nextInt(); // đọc vào số n
        var sum = 0.0; // khởi tạo biến tổng
        // thực hiện việc cộng tổng
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i; // nhớ ép kiểu sang double
        }
        // hiện kết quả:
        System.out.println("Tổng sum = " + sum);

    }
}
