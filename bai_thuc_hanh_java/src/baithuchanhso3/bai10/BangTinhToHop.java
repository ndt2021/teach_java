package baithuchanhso3.bai10;

public class BangTinhToHop {
    public static void main(String[] args) {
        int numRows = 6; // Số hàng
        int numCols = 6; // Số cột

        int[][] bangToHop = new int[numRows][numCols];

        // Tính giá trị cho từng ô trong bảng
        for (int n = 0; n < numRows; n++) {
            for (int k = 0; k <= n && k < numCols; k++) {
                if (k == 0 || k == n) {
                    bangToHop[n][k] = 1; // Điều kiện dừng
                } else {
                    bangToHop[n][k] = bangToHop[n - 1][k] + bangToHop[n - 1][k - 1]; // Công thức truy hồi
                }
            }
        }

        // In bảng
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i && j < numCols; j++) {
                System.out.print(bangToHop[i][j] + " ");
            }
            System.out.println();
        }
    }
}
