package chuong2.phan6.baitap;

import java.util.Scanner;

public class Exercises8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine(); // Nhập vào chuỗi kí tự họ và tên

        int firstSpaceIndex = fullName.indexOf(" ");
        int lastSpaceIndex = fullName.lastIndexOf(" ");

        String lastName = fullName.substring(0, firstSpaceIndex);
        String firstName = fullName.substring(lastSpaceIndex + 1);
        String midName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);

        System.out.println("Họ: " + lastName);
        System.out.println("Đệm: " + midName);
        System.out.println("Tên: " + firstName);
    }
}