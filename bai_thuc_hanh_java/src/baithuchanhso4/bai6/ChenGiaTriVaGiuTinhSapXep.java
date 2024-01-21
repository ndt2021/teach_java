package baithuchanhso4.bai6;

import java.util.Arrays;
import java.util.Scanner;

public class ChenGiaTriVaGiuTinhSapXep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của dãy số a
        System.out.print("Nhập số lượng phần tử của dãy số a: ");
        int n = scanner.nextInt();

        // Khai báo và nhập dãy số a
        int[] a = new int[n];
        System.out.println("Nhập dãy số a đã sắp xếp theo thứ tự tăng dần:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        // Nhập giá trị x cần chèn
        System.out.print("Nhập giá trị x cần chèn: ");
        int x = scanner.nextInt();

        // Chèn giá trị x vào dãy số a và giữ tính sắp xếp
        a = chenGiaTriVaGiutTinhSapXep(a, x);

        // Hiển thị dãy số a sau khi chèn
        System.out.println("Dãy số a sau khi chèn giá trị x và giữ tính sắp xếp:");
        hienThiDaySo(a);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức chèn giá trị x vào dãy số a và giữ tính sắp xếp
    private static int[] chenGiaTriVaGiutTinhSapXep(int[] a, int x) {
        // Tạo mảng mới có độ dài là lenA + 1
        int[] ketQua = new int[a.length + 1];

        // Chèn phần tử của mảng a vào mảng kết quả
        int i = 0;
        while (i < a.length && a[i] < x) {
            ketQua[i] = a[i];
            i++;
        }

        // Chèn giá trị x vào mảng kết quả
        ketQua[i] = x;

        // Chèn phần tử của mảng a từ vị trí i đến cuối vào mảng kết quả
        while (i < a.length) {
            ketQua[i + 1] = a[i];
            i++;
        }

        return ketQua;
    }

    // Phương thức hiển thị dãy số
    private static void hienThiDaySo(int[] daySo) {
        for (int i : daySo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
