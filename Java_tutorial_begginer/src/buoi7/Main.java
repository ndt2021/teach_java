package buoi7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        do {
            System.out.println("chon tinh nang n =");
            System.out.println("1 ...");
            System.out.println("2 ...");
            System.out.println("3 ...");
            System.out.println("4 ...");
            n = sc.nextInt();
        }while ( n<1 ||  n>4);

        switch (n){
            case 1:
                System.out.println("dien thoai");
                break;
            case 2:
                System.out.println("may tinh");
                break;
            case 3:
                System.out.println("may tinh bang");
                break;
            case 4:
                System.out.println("may tinh bang");
                break;
            default:
        }


    }
}
