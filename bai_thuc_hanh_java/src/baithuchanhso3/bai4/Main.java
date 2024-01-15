package baithuchanhso3.bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên n (2 <= n <= 90): ");
        int n = scanner.nextInt();

        // Kiểm tra điều kiện về n
        if (n < 2 || n > 90) {
            System.out.println("Vui lòng nhập n trong khoảng từ 2 đến 90.");
            return;
        }

        System.out.print("Nhập số nguyên k: ");
        int k = scanner.nextInt();

        inFibonacciChiaHetChoK(n, k);
    }

    public static void inFibonacciChiaHetChoK(int n, int k) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        System.out.println("N số Fibonacci đầu tiên chia hết cho " + k + ":");

        System.out.print(fibonacci[0] + " ");
        if (fibonacci[0] % k == 0) {
            System.out.print("(chia hết cho " + k + ") ");
        }

        System.out.print(fibonacci[1] + " ");
        if (fibonacci[1] % k == 0) {
            System.out.print("(chia hết cho " + k + ") ");
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(fibonacci[i] + " ");

            if (fibonacci[i] % k == 0) {
                System.out.print("(chia hết cho " + k + ") ");
            }
        }
    }
}
