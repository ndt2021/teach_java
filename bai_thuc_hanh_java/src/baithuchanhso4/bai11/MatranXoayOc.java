package baithuchanhso4.bai11;
import java.util.Scanner;

public class MatranXoayOc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng (m) và số cột (n) của ma trận
        System.out.print("Nhập số hàng (m) của ma trận: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột (n) của ma trận: ");
        int n = scanner.nextInt();

        // Khai báo và in ra ma trận xoáy ốc
        int[][] matran = taoMaTranXoayOc(m, n);
        inMaTran(matran);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức tạo ma trận xoáy ốc
    private static int[][] taoMaTranXoayOc(int m, int n) {
        int[][] matran = new int[m][n];
        int giaTri = 1;
        int hangBatDau = 0, cotBatDau = 0;
        int hangKetThuc = m - 1, cotKetThuc = n - 1;

        while (hangBatDau <= hangKetThuc && cotBatDau <= cotKetThuc) {
            // Di chuyển từ trái sang phải
            for (int i = cotBatDau; i <= cotKetThuc; i++) {
                matran[hangBatDau][i] = giaTri++;
            }
            hangBatDau++;

            // Di chuyển từ trên xuống dưới
            for (int i = hangBatDau; i <= hangKetThuc; i++) {
                matran[i][cotKetThuc] = giaTri++;
            }
            cotKetThuc--;

            // Di chuyển từ phải sang trái
            if (hangBatDau <= hangKetThuc) {
                for (int i = cotKetThuc; i >= cotBatDau; i--) {
                    matran[hangKetThuc][i] = giaTri++;
                }
                hangKetThuc--;
            }

            // Di chuyển từ dưới lên trên
            if (cotBatDau <= cotKetThuc) {
                for (int i = hangKetThuc; i >= hangBatDau; i--) {
                    matran[i][cotBatDau] = giaTri++;
                }
                cotBatDau++;
            }
        }

        return matran;
    }

    // Phương thức in ma trận
    private static void inMaTran(int[][] matran) {
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[i].length; j++) {
                System.out.printf("%4d", matran[i][j]);
            }
            System.out.println();
        }
    }
}
