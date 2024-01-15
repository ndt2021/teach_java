package buoi10;

public class main {

    public static void main(String[] args) {
        int a = 5;
        int b =6;
        //ab(a,b);
        int x = a+b;

        System.out.println(tong(5,4));
        System.out.println(tong(67,56));
        System.out.println(tong(67,54));


        int h= 7;
        int g = mess(h);
        System.out.println(g);

        String s1= "heello";
        String s2= "www";
        System.out.println(s1);
        System.out.println(s2);
        s1 =  cong(s1,s2);

        System.out.println(s1);

    }

    static String cong(String a, String b){
        a = a + b;
        return a;
    }

    static int mess ( int x){
        x = x+1;
        return x;
    }
    static int tong(int a, int b){
        System.out.println("ham tong");
        int x = a + b;
        return x;
    }

    static void ab(int a, int b){
        System.out.println("a+b=" + (a+b));
    }


    // hieu  , tich , thuong


}
