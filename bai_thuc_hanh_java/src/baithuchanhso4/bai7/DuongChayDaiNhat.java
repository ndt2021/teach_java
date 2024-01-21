package baithuchanhso4.bai7;
import java.util.Scanner;

public class DuongChayDaiNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của dãy số
        System.out.print("Nhập số lượng phần tử của dãy số: ");
        int n = scanner.nextInt();

        // Khai báo và nhập dãy số
        int[] daySo = new int[n];
        System.out.println("Nhập dãy số:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            daySo[i] = scanner.nextInt();
        }

        // Tìm đường chạy dài nhất
        int[] duongChay = timDuongChayDaiNhat(daySo);

        // Hiển thị kết quả
        System.out.print("Đường chạy dài nhất là: ");
        for (int i : duongChay) {
            System.out.print(i + " ");
        }

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức tìm đường chạy dài nhất
    private static int[] timDuongChayDaiNhat(int[] daySo) {
        int start = 0;
        int maxStart = 0;
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < daySo.length; i++) {
            if (daySo[i] >= daySo[i - 1]) {
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStart = start;
                }
            } else {
                currentLength = 1;
                start = i;
            }
        }

        // Tạo mảng chứa đường chạy dài nhất
        int[] duongChay = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            duongChay[i] = daySo[maxStart + i];
        }

        return duongChay;
    }
}
