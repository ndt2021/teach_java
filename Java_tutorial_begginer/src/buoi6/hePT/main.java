package buoi6.hePT;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class main {
    public static void main(String[] args) {
//        nhap vao a b c giai PT :  ax^2 + bx +c =0     bx+ c=0      4=0
//        a =0    -b/2a        +_ can delta   -b /2a
        Scanner sc = new Scanner(System.in);
        double a =sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(a+"x^2 " +b+"x " +c);
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("PT có vô số nghiem");
                }else{
                    System.out.println("PT vo nghiem");
                }
            }else {
                System.out.println("x = 0" + (-c/b));
            }
        }else {
            double delta = b*b - 4*a*c;
            if (delta<0){
                System.out.println("PT vo nghiem");
            }
            if (delta == 0){
                System.out.println("PT có nghiệm kép" +(-b/2*a) );
            }
            if (delta >0){
                System.out.println("PT co 2 nghiem phan biet");
                double x1= ( -b+ sqrt(delta) )/ (2*a);
                double x2= ( -b- sqrt(delta) )/ (2*a);
                System.out.println("x1 =" + x1);
                System.out.println("x2 =" + x2);
            }
        }

    }
}
