package baithuchanhso4.bai17;
import java.util.Scanner;

public class ChuyenDoiHoTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập xâu họ tên từ bàn phím
        System.out.print("Nhập xâu họ tên: ");
        String hoTen = scanner.nextLine();

        // Chuyển đổi xâu họ tên
        String hoTenChuyenDoi = chuyenDoiHoTen(hoTen);

        // Hiển thị xâu họ tên sau khi chuyển đổi
        System.out.println("Xâu họ tên sau khi chuyển đổi: " + hoTenChuyenDoi);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức chuyển đổi xâu họ tên
    private static String chuyenDoiHoTen(String hoTen) {
        // Tách xâu thành các phần: họ, đệm, tên
        String[] cacPhan = hoTen.split("\\s+");

        // Kiểm tra xem có đủ ba phần không
        if (cacPhan.length != 3) {
            System.out.println("Xâu không đúng định dạng. Vui lòng nhập lại.");
            return hoTen;
        }

        // Chuyển đổi thành biểu diễn theo cấu trúc "tên...họ...đệm"
        String ten = cacPhan[2];
        String ho = cacPhan[0];
        String dem = cacPhan[1];

        return ten + " " + ho + " " + dem;
    }
}
