package chuong3.phan7.baitap;


import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var m = input.nextInt();
        // vẽ hình
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == m || j == 1 || j == m ||
                        i == j || (i + j) == (m + 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}