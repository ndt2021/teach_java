package chuong4.phan5;

public class Main {
    public static void main(String[] args) {
        System.out.println(giaiThua(6));
    }
    public static int giaiThua(int n){
        if(n==1){
            return 1;
        }
        return n*giaiThua(n-1);
    }

}
