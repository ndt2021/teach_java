package baithuchanhso4.bai18;
import java.util.HashMap;
import java.util.Scanner;

public class LaMaToSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số viết dưới dạng LA MÃ
        System.out.print("Nhập số viết dưới dạng LA MÃ: ");
        String laMa = scanner.nextLine();

        // Tính giá trị của số LA MÃ
        int giaTri = tinhGiaTriLaMa(laMa);

        // Hiển thị kết quả
        System.out.println("Giá trị của số LA MÃ " + laMa + " là: " + giaTri);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức tính giá trị của số LA MÃ
    private static int tinhGiaTriLaMa(String laMa) {
        // Khởi tạo bảng chứa giá trị của các ký tự LA MÃ
        HashMap<Character, Integer> bangGiaTri = new HashMap<>();
        bangGiaTri.put('I', 1);
        bangGiaTri.put('V', 5);
        bangGiaTri.put('X', 10);
        bangGiaTri.put('L', 50);
        bangGiaTri.put('C', 100);
        bangGiaTri.put('D', 500);
        bangGiaTri.put('M', 1000);

        int giaTri = 0;
        int i = 0;

        while (i < laMa.length()) {
            char hienTai = laMa.charAt(i);
            int giaTriHienTai = bangGiaTri.get(hienTai);

            if (i + 1 < laMa.length()) {
                char tiepTheo = laMa.charAt(i + 1);
                int giaTriTiepTheo = bangGiaTri.get(tiepTheo);

                // Nếu giá trị của ký tự tiếp theo lớn hơn giá trị của ký tự hiện tại
                if (giaTriTiepTheo > giaTriHienTai) {
                    giaTri += (giaTriTiepTheo - giaTriHienTai);
                    i += 2;
                } else {
                    giaTri += giaTriHienTai;
                    i++;
                }
            } else {
                giaTri += giaTriHienTai;
                i++;
            }
        }

        return giaTri;
    }
}
