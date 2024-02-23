package chuong3.phan1.baitap;

import java.util.Scanner;

public class Exercises8 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var str = scanner.nextLine();

        // check and print result
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}