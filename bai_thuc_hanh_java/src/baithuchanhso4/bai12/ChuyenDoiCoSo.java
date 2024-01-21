package baithuchanhso4.bai12;
import java.util.Scanner;

public class ChuyenDoiCoSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số tự nhiên ở hệ cơ số 10
        System.out.print("Nhập số tự nhiên ở hệ cơ số 10: ");
        int soTuDinhDang = scanner.nextInt();

        // Nhập hệ cơ số mới (1 < b ≤ 36)
        System.out.print("Nhập hệ cơ số mới (1 < b ≤ 36): ");
        int heCoSoMoi = scanner.nextInt();

        // Kiểm tra điều kiện hệ cơ số mới
        if (heCoSoMoi < 2 || heCoSoMoi > 36) {
            System.out.println("Hệ cơ số mới không hợp lệ. Hãy nhập lại.");
        } else {
            // Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số mới
            String ketQua = chuyenDoiCoSo(soTuDinhDang, heCoSoMoi);

            // Hiển thị kết quả
            System.out.println("Số " + soTuDinhDang + " ở hệ cơ số 10 chuyển sang hệ cơ số " + heCoSoMoi + " là: " + ketQua);
        }

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức chuyển đổi số từ hệ cơ số 10 sang hệ cơ số mới
    private static String chuyenDoiCoSo(int soTuDinhDang, int heCoSoMoi) {
        if (soTuDinhDang == 0) {
            return "0";
        }

        StringBuilder ketQua = new StringBuilder();
        while (soTuDinhDang > 0) {
            int phanDu = soTuDinhDang % heCoSoMoi;
            char kiTu;
            if (phanDu < 10) {
                kiTu = (char) ('0' + phanDu);
            } else {
                kiTu = (char) ('A' + phanDu - 10);
            }
            ketQua.insert(0, kiTu);
            soTuDinhDang /= heCoSoMoi;
        }

        return ketQua.toString();
    }
}
