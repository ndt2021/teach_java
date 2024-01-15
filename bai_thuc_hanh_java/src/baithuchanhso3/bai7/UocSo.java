package baithuchanhso3.bai7;

import java.util.Scanner;

public class UocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương n
        System.out.print("Nhập vào một số nguyên dương n: ");
        int n = scanner.nextInt();

        // a) Liệt kê các ước số của n và đếm số lượng ước số
        System.out.println("a) Các ước số của " + n + " là:");
        int countUocSo = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                countUocSo++;
            }
        }
        System.out.println("\nTổng cộng có " + countUocSo + " ước số.");

        // b) Liệt kê các ước số là số nguyên tố của n
        System.out.println("b) Các ước số là số nguyên tố của " + n + " là:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && isNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Phương thức kiểm tra xem một số có phải là số nguyên tố hay không
    private static boolean isNguyenTo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
