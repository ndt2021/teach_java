package chuong6.phan10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson610 {
    public static void main(String[] args) throws FileNotFoundException {
        // tạo đối tượng file trỏ tới file cần đọc
        File inputFile = new File("D:\\curriculum (For Teaching)\\teach_java\\dayjava\\src\\chuong6\\phan10\\input.txt");
        // tạo đối tượng scanner để đọc dữ liệu từ file
        Scanner scanner = new Scanner(inputFile);
        // tạo arraylist để chứa danh sách sinh viên
        ArrayList<Student> students = new ArrayList<>();
        // gọi method đọc file
        readStudentFromFile(students, scanner);
        scanner.close(); // đóng luồng đọc file
        showStudentInfo(students); // hiển thị thông tin lên màn hình
    }

    /**
     * Phương thức đọc ra thông tin sinh viên trong file.
     *
     * @param students danh sách sinh viên đọc được
     * @param scanner  đối tượng đọc file
     */
    private static void readStudentFromFile(ArrayList<Student> students, Scanner scanner) {
        while (scanner.hasNextLine()) {
            var age = scanner.nextInt();
            scanner.nextLine();
            var address = scanner.nextLine();
            var fullName = scanner.nextLine();
            var email = scanner.nextLine();
            var gpa = scanner.nextFloat();
            var student = new Student(fullName, address, email, gpa, age);
            students.add(student);
        }
    }

    /**
     * Phương thức hiển thị thông tin sinh viên dạng bảng.
     *
     * @param students danh sách sinh viên cần hiển thị.
     */
    private static void showStudentInfo(ArrayList<Student> students) {
        System.out.println("================= THÔNG TIN SINH VIÊN =================");
        System.out.printf("%-30s%-25s%-25s%-10s%-10s\n",
                "Họ và tên", "Địa chỉ", "Email", "Điểm gpa", "Tuổi");
        for (var student : students) {
            System.out.printf("%-30s%-25s%-25s%-10.2f%-10d\n",
                    student.getFullName(), student.getAddress(), student.getEmail(),
                    student.getGpa(), student.getAge());
        }
    }
}
