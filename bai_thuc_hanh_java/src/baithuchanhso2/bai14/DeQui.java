package baithuchanhso2.bai14;

import java.util.Scanner;

public class DeQui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào n (2 <= n <= 90): ");
        int n = scanner.nextInt();

        if (n < 2 || n > 90) {   //   &&
            System.out.println("Vui lòng nhập n trong khoảng từ 2 đến 90.");
        } else {
            System.out.println("Dãy Fibonacci đầu tiên " + n + " số là:");
            for (int i = 0; i < n; i++) {  // 0  1  2  3  n-1
                System.out.print(fibonacci(i) + " ");
            }
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }

    // Hàm đệ quy để tính số Fibonacci thứ n
    static int fibonacci(int n) {
        if (n == 0) { // then
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
