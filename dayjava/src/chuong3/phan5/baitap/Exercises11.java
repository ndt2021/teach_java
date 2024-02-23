package chuong3.phan5.baitap;

import java.util.Scanner;

public class Exercises11 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var result = checkFriendlyNumber(a, b) && checkFriendlyNumber(b, a);
        System.out.println(result ? "YES" : "NO");
    }

    private static boolean checkFriendlyNumber(int m, int n) {
        if (m < 2) {
            return false;
        }
        int sum = sumDivisor(m);
        return sum == n;
    }

    // Phương thức tính tổng các ước của một số
    private static int sumDivisor(int m) {
        int sum = 1;
        int bound = (int) Math.sqrt(m);
        for (int i = 2; i <= bound; i++) {
            if (m % i == 0) {
                if (m / i == i) {
                    sum += i;
                } else {
                    sum += i;
                    sum += m / i;
                }
            }
        }
        return sum;
    }
}