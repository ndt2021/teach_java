package chuong3.phan1.baitap;

import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();

        // kiểm tra đưa ra kết luận
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("KHÔNG");
        } else if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("CÓ");
        } else {
            System.out.println("KHÔNG");
        }
    }
}
