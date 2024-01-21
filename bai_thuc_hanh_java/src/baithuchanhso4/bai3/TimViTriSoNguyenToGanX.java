package baithuchanhso4.bai3;
import java.util.Scanner;

public class TimViTriSoNguyenToGanX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng a có n phần tử
        int[] a = new int[n];

        // Nhập giá trị cho mỗi phần tử trong mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        // Nhập số X
        System.out.print("Nhập số X: ");
        int x = scanner.nextInt();

        // Tìm vị trí của số nguyên tố trong mảng a gần với X nhất
        int viTriGanNhat = timViTriSoNguyenToGanX(a, x);

        // Hiển thị kết quả
        if (viTriGanNhat != -1) {
            System.out.println("Vị trí của số nguyên tố gần với X nhất trong mảng a là: " + (viTriGanNhat + 1));
        } else {
            System.out.println("Trong mảng a không có số nguyên tố nào.");
        }

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức tìm vị trí của số nguyên tố gần với X nhất trong mảng
    private static int timViTriSoNguyenToGanX(int[] arr, int x) {
        int viTriGanNhat = -1;
        int khoangCachMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (laSoNguyenTo(arr[i])) {
                int khoangCach = Math.abs(arr[i] - x);

                if (khoangCach < khoangCachMin) {
                    khoangCachMin = khoangCach;
                    viTriGanNhat = i;
                }
            }
        }

        return viTriGanNhat;
    }

    // Phương thức kiểm tra xem một số có phải là số nguyên tố hay không
    private static boolean laSoNguyenTo(int num) {
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
