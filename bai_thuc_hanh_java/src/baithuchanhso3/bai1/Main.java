package baithuchanhso3.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều cao h của tam giác cân: ");
        int h = scanner.nextInt();

        if (h <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            // In ra tam giác cân
            for (int i = 1; i <= h; i++) {
                // In ra khoảng trắng trước '*' để tạo dạng tam giác cân
                for (int j = 1; j <= h - i; j++) {
                    System.out.print(" ");
                }

                // In ra '*' dựa vào số thứ tự của dòng
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }

                // Xuống dòng sau mỗi dòng
                System.out.println();
            }
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
