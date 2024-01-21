package baithuchanhso4.bai13;

public class SoThuanNghich {
    public static void main(String[] args) {
        System.out.println("Các số thuận nghịch có 6 chữ số là:");
        lietKeSoThuanNghich();
    }

    // Phương thức kiểm tra số thuận nghịch
    private static boolean laSoThuanNghich(String so) {
        // So sánh chuỗi với chuỗi đảo ngược của nó
        String daoNguoc = new StringBuilder(so).reverse().toString();
        return so.equals(daoNguoc);
    }

    // Phương thức liệt kê các số thuận nghịch có 6 chữ số
    private static void lietKeSoThuanNghich() {
        for (int i = 100000; i <= 999999; i++) {
            String so = Integer.toString(i);
            if (laSoThuanNghich(so)) {
                System.out.println(so);
            }
        }
    }
}
