package baithuchanhso4.bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaiTapDemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng a có n phần tử
        int[] a = new int[n];

        // Nhập giá trị cho mỗi phần tử trong mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        // Sử dụng Map để đếm số lần xuất hiện của từng phần tử trong mảng
        Map<Integer, Integer> demSoLanXuatHien = new HashMap<>();
        for (int i : a) {
            demSoLanXuatHien.put(i, demSoLanXuatHien.getOrDefault(i, 0) + 1);
        }

        // Tìm phần tử có số lần xuất hiện nhiều nhất
        int phanTuNhieuNhat = 0;
        int maxSoLanXuatHien = 0;
        for (Map.Entry<Integer, Integer> entry : demSoLanXuatHien.entrySet()) {
            if (entry.getValue() > maxSoLanXuatHien) {
                maxSoLanXuatHien = entry.getValue();
                phanTuNhieuNhat = entry.getKey();
            }
        }

        // Hiển thị kết quả
        System.out.println("Số lần xuất hiện của từng phần tử trong mảng:");
        for (Map.Entry<Integer, Integer> entry : demSoLanXuatHien.entrySet()) {
            System.out.println("Phần tử " + entry.getKey() + ": " + entry.getValue() + " lần");
        }

        System.out.println("Phần tử xuất hiện nhiều nhất trong mảng: " + phanTuNhieuNhat +
                " (xuất hiện " + maxSoLanXuatHien + " lần)");

        // Đóng Scanner
        scanner.close();
    }
}
