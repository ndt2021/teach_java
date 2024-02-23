package chuong3.phan5.baitap;

import java.util.Scanner;

public class Exercises4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var str = input.nextLine(); // Nhập vào chuỗi kí tự

        str = str.trim(); // loại bỏ các dấu cách thừa

        // thay thế các chỗ có 1 hoặc nhiều khoảng trắng bằng 1 dấu cách
        str = str.replaceAll("\\s+", " ");
        int count = 0;
        if (!str.isEmpty()) { // nếu str không rỗng
            count = 1; // ít nhất chuỗi str có 1 từ
        }

        // tiến hành đếm số từ
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++; // tăng biến đếm lên
            }
        }

        System.out.println(count);
    }
}