package baithuchanhso4.bai1;
import java.util.Scanner;

public class BaiTapMangDoiXung {
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

        // Kiểm tra xem mảng có phải là mảng đối xứng hay không
        boolean isDoiXung = true;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - 1 - i]) {
                isDoiXung = false;
                break;
            }
        }

        // Hiển thị kết quả
        if (isDoiXung) {
            System.out.println("Mảng là mảng đối xứng.");
        } else {
            System.out.println("Mảng không phải là mảng đối xứng.");
        }

        // Đóng Scanner
        scanner.close();
    }
}
