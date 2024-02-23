package chuong3.phan1.baitap;

import java.util.Scanner;

public class Exercises5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var str = scanner.nextLine();

        // check and print result
        if (str.matches("^\\s+.*")) { // có thể sử dụng str.startsWith(" ")
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}