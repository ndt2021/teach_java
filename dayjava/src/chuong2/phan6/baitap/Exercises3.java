package chuong2.phan6.baitap;

import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); // nhập vào chuỗi
        String result = str.replace(" ", "*"); // thay thế các dấu cách bằng kí tự '*'
        System.out.println(result);
    }
}