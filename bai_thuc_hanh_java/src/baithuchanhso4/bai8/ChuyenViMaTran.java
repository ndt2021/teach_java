package baithuchanhso4.bai8;
import java.util.Scanner;

public class ChuyenViMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng (m) và số cột (n) của ma trận A
        System.out.print("Nhập số hàng (m) của ma trận A: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột (n) của ma trận A: ");
        int n = scanner.nextInt();

        // Khai báo và nhập ma trận A
        int[][] A = new int[m][n];
        System.out.println("Nhập ma trận A:");
        nhapMaTran(A, m, n, scanner);

        // Tìm ma trận chuyển vị B
        int[][] B = chuyenViMaTran(A);

        // Hiển thị ma trận A
        System.out.println("Ma trận A:");
        hienThiMaTran(A);

        // Hiển thị ma trận chuyển vị B
        System.out.println("Ma trận chuyển vị B:");
        hienThiMaTran(B);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức nhập ma trận
    private static void nhapMaTran(int[][] matrix, int rows, int cols, Scanner scanner) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử a[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Phương thức tìm ma trận chuyển vị
    private static int[][] chuyenViMaTran(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
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
