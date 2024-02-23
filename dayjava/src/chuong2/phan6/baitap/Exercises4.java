package chuong2.phan6.baitap;

import java.util.Scanner;

public class Exercises4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(str1.indexOf(str2));
    }
}