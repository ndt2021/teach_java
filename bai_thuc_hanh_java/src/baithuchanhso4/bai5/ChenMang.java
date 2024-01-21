package baithuchanhso4.bai5;
import java.util.Scanner;

public class ChenMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng a
        System.out.print("Nhập số phần tử của mảng a: ");
        int N = scanner.nextInt();

        // Nhập mảng a
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng a: ");
            a[i] = scanner.nextInt();
        }

        // Nhập số nguyên p
        System.out.print("Nhập số nguyên p (0 ≤ p < " + N + "): ");
        int p = scanner.nextInt();

        // Kiểm tra điều kiện về p
        if (p < 0 || p >= N) {
            System.out.println("Giá trị của p không hợp lệ.");
            return;
        }

        // Nhập số phần tử của mảng b
        System.out.print("Nhập số phần tử của mảng b: ");
        int M = scanner.nextInt();

        // Nhập mảng b
        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng b: ");
            b[i] = scanner.nextInt();
        }

        // Chèn mảng b vào vị trí p của mảng a
        a = chenMang(a, b, p);

        // Hiển thị mảng a sau khi chèn
        System.out.println("Mảng a sau khi chèn mảng b vào vị trí p:");
        hienThiMang(a);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức chèn mảng b vào vị trí p của mảng a
    private static int[] chenMang(int[] a, int[] b, int p) {
        int lenA = a.length;
        int lenB = b.length;

        // Tạo mảng mới có độ dài là lenA + lenB
        int[] ketQua = new int[lenA + lenB];

        // Chèn phần tử của mảng a từ đầu đến p vào mảng kết quả
        for (int i = 0; i < p; i++) {
            ketQua[i] = a[i];
        }

        // Chèn phần tử của mảng b vào mảng kết quả
        for (int i = 0; i < lenB; i++) {
            ketQua[p + i] = b[i];
        }

        // Chèn phần tử của mảng a từ vị trí p đến cuối vào mảng kết quả
        for (int i = p; i < lenA; i++) {
            ketQua[lenB + i] = a[i];
        }

        return ketQua;
    }

    // Phương thức hiển thị mảng
    private static void hienThiMang(int[] mang) {
        for (int i : mang) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
