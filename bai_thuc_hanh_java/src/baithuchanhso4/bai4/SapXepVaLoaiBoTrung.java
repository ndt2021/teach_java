package baithuchanhso4.bai4;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SapXepVaLoaiBoTrung {
    public static void main(String[] args) {
        // Số lượng phần tử của mảng
        int N = 10;

        // Tạo ngẫu nhiên mảng a
        int[] a = taoMangNgauNhien(N);

        // Hiển thị mảng trước khi sắp xếp và loại bỏ trùng
        System.out.println("Mảng trước khi sắp xếp và loại bỏ trùng:");
        hienThiMang(a);

        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(a);

        // Loại bỏ các phần tử trùng nhau
        a = loaiBoTrung(a);

        // Hiển thị mảng sau khi sắp xếp và loại bỏ trùng
        System.out.println("Mảng sau khi sắp xếp và loại bỏ trùng:");
        hienThiMang(a);
    }

    // Phương thức tạo mảng ngẫu nhiên
    private static int[] taoMangNgauNhien(int N) {
        int[] mang = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            mang[i] = random.nextInt(20); // Giả sử giới hạn giá trị từ 0 đến 19
        }

        return mang;
    }

    // Phương thức loại bỏ các phần tử trùng nhau
    private static int[] loaiBoTrung(int[] mang) {
        Set<Integer> set = new HashSet<>();

        // Thêm các phần tử vào Set để loại bỏ trùng
        for (int i : mang) {
            set.add(i);
        }

        // Chuyển Set thành mảng
        int[] mangSauLoaiBo = new int[set.size()];
        int index = 0;
        for (int i : set) {
            mangSauLoaiBo[index++] = i;
        }

        return mangSauLoaiBo;
    }

    // Phương thức hiển thị mảng
    private static void hienThiMang(int[] mang) {
        for (int i : mang) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
