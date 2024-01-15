package buoi9;

public class string {
    public static void main(String[] args) {

        String s1 = "helba";
        System.out.println(s1);
        String s2 = "el" ; // new String()
        int len = s2.length();
        System.out.println(len);

        String s =  s1.concat(s2);  //

        // truyền bản sao
        // truyền địa chỉ

        System.out.println(s);
       // System.out.println(s1.compareTo(s2));
        System.out.println(s1.indexOf(s2));
    }
}
