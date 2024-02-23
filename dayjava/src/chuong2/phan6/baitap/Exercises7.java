package chuong2.phan6.baitap;

import java.util.Scanner;

public class Exercises7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();  // nhập vào chuỗi họ và tên
        String result = fullName.trim();       // hàm trim() loại bỏ dấu cách ở đầu và cuỗi câu
        result = result.replaceAll("\\s+", " ");
        System.out.println(result);
    }
}