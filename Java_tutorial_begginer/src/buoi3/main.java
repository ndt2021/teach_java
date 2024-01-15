package buoi3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
//        System.out.println(myVar1);
//        System.out.println(myVar2);
//        System.out.println(myVar3);
//
        int x = 67;
        System.out.println((char)x);
        char y = 'R'+5;
        System.out.println("y="+y); // y la char
        char z = 'a'-32;
        System.out.println("a="+z);

     // primitive => stack
        //  stack là nơi chứa địa chỉ  - > object

        // Scanner

       Scanner sc = new Scanner(System.in);
        System.out.println("nhap a=");
        int a = sc.nextInt();
        System.out.println("nhap b=");
        int b = sc.nextInt();
        System.out.println("a+b=" +(a+b) );
        String str = sc.nextLine();

        sc.nextLine();   //

//        System.out.println("nhập vào tên của bạn");
//        String name = sc.nextLine();
//        System.out.println("ho ten:" + name);
        char c = sc.next().charAt(0);  // String  "g" =>

        sc.close();
    }
}
