package chuong2.phan6.baitap;

import java.util.Scanner;

public class Exercises9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();  // nhập vào chuỗi kí tự
        System.out.println(0 + " '" + str.charAt(0) + "'");
        System.out.println((str.length() - 1) + " '" + str.charAt(str.length() - 1) + "'");
    }
}