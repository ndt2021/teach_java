package baithuchanhso3.bai6;

import java.util.Scanner;

public class TinhToanSoNguyenDuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        // Kiểm tra điều kiện số nguyên dương
        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
            return;
        }

        // a) Tính tổng các chữ số của n
        int tongChuSo = tinhTongChuSo(n);
        System.out.println("a) Tổng các chữ số của n: " + tongChuSo);

        // b) Phân tích n thành các thừa số nguyên tố
        System.out.println("b) Phân tích n thành các thừa số nguyên tố:");
        phanTichThanhThuaSoNguyenTo(n);
    }

    public static int tinhTongChuSo(int n) {
        int tong = 0;
        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }
        return tong;
    }

    public static void phanTichThanhThuaSoNguyenTo(int n) {
        System.out.print(n + " = ");

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;

                if (n > 1) {
                    System.out.print(" * ");
                }
            }
        }
        System.out.println();
    }
}
