package chuong3.phan9;
import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào kích thước hình chữ nhật: ");
        var m = input.nextInt();
        var n = input.nextInt();
        if (m > 0 && n > 0) {
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Kích thước hình chữ nhật phải nguyên dương");
        }
    }
}
