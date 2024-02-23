package chuong2.phan6.baitap;

import java.util.Scanner;

public class Exercises6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine(); // Nhập vào chuỗi str1
        String str2 = input.nextLine(); // Nhập vào chuỗi str2

        str1 = str1.trim();
        str2 = str2.trim();

        System.out.println(str1.concat(str2));
    }
}