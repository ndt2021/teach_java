package buoi4_2;

public class If {
    public static void main(String[] args) {
//
//        int a=5;
//
//        if(a>0){
//            System.out.println("a la so duong");
//        }
//
//        if (a>0){
//            System.out.println("a la so duowng");
//        }else{
//            System.out.println(" la 0 hoac la nho hon 0");
//        }
/*

        int x =20;

        if(x<10 && x>0){
            System.out.println("x thoa man dieu kien");
        }else {
            System.out.println("x khong thoa man dieu kien");
        }
*/
        int a,b,c;


//        if (a>0){
//            System.out.println("a la so nguyen duong");
//        }else if (a<0){
//            System.out.println("a la so nguyen am");
//        }else {
//            System.out.println("a=0");
//        }


        a=8;b=6;c=5; // abc khac nhau
        if (a<b){
             if (b<c){
                 System.out.println("a<b<c");
             }else{
                 if (a>c){
                     System.out.println("c<a<b");
                 }else {
                     System.out.println("a<c<b");
                 }
             }
        }else { // a>b
            System.out.println("a<b<c");
            if(a>b){
                System.out.println("a>b>c");
            }else {
                System.out.println("a>c>b");
            }

        }



    }
}
