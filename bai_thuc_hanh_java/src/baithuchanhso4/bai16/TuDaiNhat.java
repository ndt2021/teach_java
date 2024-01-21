package baithuchanhso4.bai16;
import java.util.Scanner;

public class TuDaiNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập xâu ký tự từ bàn phím
        System.out.print("Nhập xâu ký tự: ");
        String xauKyTu = scanner.nextLine();

        // Tìm từ dài nhất và vị trí xuất hiện
        String tuDaiNhat = timTuDaiNhat(xauKyTu);
        int viTriXuatHien = xauKyTu.indexOf(tuDaiNhat);

        // Hiển thị kết quả
        System.out.println("Từ dài nhất trong xâu: " + tuDaiNhat);
        System.out.println("Vị trí xuất hiện: " + viTriXuatHien);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức tìm từ dài nhất trong xâu
    private static String timTuDaiNhat(String xau) {
        String[] cacTu = xau.split("\\s+"); // Tách xâu thành các từ

        String tuDaiNhat = "";
        for (String tu : cacTu) {
            if (tu.length() > tuDaiNhat.length()) {
                tuDaiNhat = tu;
            }
        }

        return tuDaiNhat;
    }
}
