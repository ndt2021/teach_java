package chuong3.phan1.baitap;

import java.util.Scanner;

public class Exercises10 {
    public static void main(String[] args) {
        // ax^2 + bx + c = 0
        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("VÔ SỐ NGHIỆM");
            } else if (b == 0 && c != 0) {
                System.out.println("VÔ NGHIỆM");
            } else if (b != 0 && c == 0) {
                System.out.println("x = 0");
            } else if (b != 0 && c != 0) {
                System.out.println("x = " + (-c / b));
            }
        } else if (a != 0) {
            var delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("VÔ NGHIỆM");
            } else if (delta == 0) {
                System.out.println("x = " + (-b / (2 * a)));
            } else if (delta > 0) {
                System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / 2 * a));
                System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / 2 * a));
            }
        }
    }
}