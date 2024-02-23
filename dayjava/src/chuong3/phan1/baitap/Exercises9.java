package chuong3.phan1.baitap;

import java.util.Scanner;

public class Exercises9 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double a, b, h;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        h = scanner.nextDouble();

        // check and print result
        if (a > 0 && b > 0 && h > 0) {
            double area = (a + b) * h / 2;
            System.out.println(area);
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}