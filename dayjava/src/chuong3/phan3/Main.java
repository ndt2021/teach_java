package chuong3.phan3;

public class Main {
    public static void main(String[] args) {
       /* int x = 3 ;
        int y =4;
        int a = ( x>y ) ? 1 : 2;
        System.out.println(" a = " + a);*/

        int a = 201;
        var kq ="";
        if(a%2==0){
            kq = "so chan";
        }else kq = "so le";

        kq = (a%2==0) ? "so chan" : "so le";

        System.out.println(kq);
    }
}
