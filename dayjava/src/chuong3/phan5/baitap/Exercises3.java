package chuong3.phan5.baitap;

import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var str = input.nextLine();

        // tiến hành kiểm tra và in ra
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != ' ') {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            } else if (i != 0 && str.charAt(i) == ' ') {
                System.out.print(" " + Character.toUpperCase(str.charAt(i + 1)));
                i++;
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}