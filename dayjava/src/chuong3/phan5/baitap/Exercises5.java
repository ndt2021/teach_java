package chuong3.phan5.baitap;

import java.util.Scanner;

public class Exercises5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var str = input.nextLine();

        str = str.trim(); // loại bỏ các dấu cách thừa

        // thay thế các chỗ có 1 hoặc nhiều khoảng trắng bằng 1 dấu cách
        str = str.replaceAll("\\s+", " ");

        // in ra theo thứ tự ngược lại:
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}