package baithuchanhso2.bai14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào n (2 <= n <= 90): ");
        int n = scanner.nextInt();

        if (n < 2 || n > 90) {
            System.out.println("Vui lòng nhập n trong khoảng từ 2 đến 90.");
        } else {
            System.out.println("Dãy Fibonacci đầu tiên " + n + " số là:");
            printFibonacciSequence(n);
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }

    static void printFibonacciSequence(int n) {

        long[] fibonacciNumbers = new long[n];

        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }
    }
}
