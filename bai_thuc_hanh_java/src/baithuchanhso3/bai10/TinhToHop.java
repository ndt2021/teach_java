package baithuchanhso3.bai10;

public class TinhToHop {
    public static void main(String[] args) {
        int n = 5; // Số hàng
        int k = 2; // Số cột

        System.out.println("Giá trị " + k + "C" + n + " là: " + tinhToHop(k, n));
    }

    private static int tinhToHop(int k, int n) {
        // Điều kiện dừng
        if (k == 0 || k == n) {
            return 1;
        }

        // Công thức truy hồi
        return tinhToHop(k, n - 1) + tinhToHop(k - 1, n - 1);
    }
}
