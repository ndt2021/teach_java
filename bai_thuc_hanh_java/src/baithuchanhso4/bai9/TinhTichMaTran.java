package baithuchanhso4.bai9;
import java.util.Scanner;

public class TinhTichMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng (m) và số cột (n) của ma trận A
        System.out.print("Nhập số hàng (m) của ma trận A: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột (n) của ma trận A: ");
        int n = scanner.nextInt();

        // Nhập số hàng (p) của ma trận B (n phải bằng p để có thể nhân ma trận)
        System.out.print("Nhập số hàng (p) của ma trận B: ");
        int p = scanner.nextInt();

        // Kiểm tra điều kiện để nhân ma trận
        if (n != p) {
            System.out.println("Không thể nhân hai ma trận với số cột của ma trận A không bằng số hàng của ma trận B.");
            return;
        }

        // Khai báo và nhập ma trận A
        int[][] A = new int[m][n];
        System.out.println("Nhập ma trận A:");
        nhapMaTran(A, m, n, scanner);

        // Khai báo và nhập ma trận B
        int[][] B = new int[n][p];
        System.out.println("Nhập ma trận B:");
        nhapMaTran(B, n, p, scanner);

        // Tính tích của hai ma trận
        int[][] tichMaTran = tinhTichMaTran(A, B);

        // Hiển thị ma trận A
        System.out.println("Ma trận A:");
        hienThiMaTran(A);

        // Hiển thị ma trận B
        System.out.println("Ma trận B:");
        hienThiMaTran(B);

        // Hiển thị ma trận tích
        System.out.println("Tích của hai ma trận A và B:");
        hienThiMaTran(tichMaTran);

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

    // Phương thức tính tích của hai ma trận
    private static int[][] tinhTichMaTran(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;

        int[][] tichMaTran = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    tichMaTran[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return tichMaTran;
    }

    // Phương thức hiển thị ma trận
    private static void hienThiMaTran(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
