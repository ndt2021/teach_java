package baithuchanhso4.bai15;
import java.util.Scanner;

public class ChuanHoaXau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập xâu ký tự từ bàn phím
        System.out.print("Nhập xâu ký tự: ");
        String xauKyTu = scanner.nextLine();

        // Thực hiện chuẩn hoá xâu ký tự
        String xauChuanHoa = chuanHoaXau(xauKyTu);

        // Hiển thị xâu ký tự đã chuẩn hoá
        System.out.println("Xâu ký tự sau khi chuẩn hoá: " + xauChuanHoa);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức chuẩn hoá xâu ký tự
    private static String chuanHoaXau(String xau) {
        // Loại bỏ dấu cách thừa và chuyển ký tự đầu mỗi từ thành chữ hoa
        StringBuilder xauChuanHoa = new StringBuilder();
        boolean chuaLaKhoangTrang = true;

        for (char kyTu : xau.toCharArray()) {
            if (Character.isWhitespace(kyTu)) {
                chuaLaKhoangTrang = true;
            } else {
                if (chuaLaKhoangTrang) {
                    kyTu = Character.toUpperCase(kyTu);
                    chuaLaKhoangTrang = false;
                } else {
                    kyTu = Character.toLowerCase(kyTu);
                }
                xauChuanHoa.append(kyTu);
            }
        }

        return xauChuanHoa.toString();
    }
}
