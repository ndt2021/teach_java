package bai2.phan3;

import java.util.Scanner;

public class NhapDuLieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("in ra a=" + a);;
//        byte b = sc.nextByte();
//        short s = sc.nextShort();
//        int age = sc.nextInt();

        String s1 = sc.nextLine(); // đọc dấu xuống dòng
        int a = sc.nextInt();
        sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.next();
        char c = sc.next().charAt(0); // iefn  0123
        System.out.println("c = " + c);
        System.out.println("s1= " + s1);
        System.out.println("s2= " + s2);
        sc.close();
    }
}
