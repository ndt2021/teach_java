package chuong5.phan6;

public class Main {
    public static void main(String[] args) {

    }

    public static int tong(int a, int b){
        return a+b;
    }
    public static int tong(int a, int b, int c){
        return a+b+c;
    }

    public static int tong(int... numbers){
        int sum=0;
        for (int nu : numbers) {
            sum = sum + nu;
        }
        return sum;
    }

}
