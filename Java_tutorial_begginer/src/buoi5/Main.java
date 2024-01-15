package buoi5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= b && b <= c) {
            System.out.println("increasing");
        } else if (a >= b && b >= c) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither increasing nor decreasing order");
        }*/

        // ax +b = 0
        // nhap a b sau do tim nghiem x =
/*

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a =");
        Double a = sc.nextDouble();
        System.out.println("nhap b =");
        Double b = sc.nextDouble();

        if (a==0){
            System.out.println("PT vo nghiem");
        }else {
            System.out.println("x= "+(-b/a) );
        }
*/

        // nhap a , b ,c
        // tinh nghiem cho PT ax^2 + bx + c = 0
// delta = b^2 - 4ac
    //    int x =3;

    /*    switch(x) {
            case 1:
                System.out.println("khoi lenh so1");
                break;
            case 2:
                System.out.println("k l enh 2");
                break;
            default:
                System.out.println(" default");
        }
*/
        int i=3;
        for (; i<=100; i=i+3){
                System.out.println(i+ " ");
        }

        int x =101;
        while (x <100){
            System.out.println("vong lap thu" + x);
            x = x+2;
        }


        int y = 11;
        do {
            System.out.println("output"+y);
        }while (y<10);







    }
}
