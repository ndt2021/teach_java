package baithuchanhso4.bai10;
import java.util.Arrays;
import java.util.Scanner;

public class LietKeMaTranTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng (n) và số cột (m) của ma trận A
        System.out.print("Nhập số hàng (n) của ma trận A: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột (m) của ma trận A: ");
        int m = scanner.nextInt();

        // Khai báo và nhập ma trận A
        int[][] A = new int[n][m];
        System.out.println("Nhập ma trận A:");
        nhapMaTran(A, n, m, scanner);

        // Liệt kê tất cả các phần tử của ma trận theo thứ tự tăng dần
        System.out.println("Tất cả các phần tử của ma trận A theo thứ tự tăng dần:");
        lietKeTangDan(A);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức nhập ma trận
    private static void nhapMaTran(int[][] matrix, int rows, int cols, Scanner scanner) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Phương thức liệt kê tất cả các phần tử của ma trận theo thứ tự tăng dần
    private static void lietKeTangDan(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Chuyển ma trận thành mảng một chiều và sắp xếp
        int[] mangMotChieu = new int[n * m];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mangMotChieu[index++] = matrix[i][j];
            }
        }
        Arrays.sort(mangMotChieu);

        // Hiển thị các phần tử theo thứ tự tăng dần
        index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mangMotChieu[index++] + " ");
            }
            System.out.println();
        }
    }
}
