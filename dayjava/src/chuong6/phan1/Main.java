package chuong6.phan1;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Meo den", 3, 3.5f, "do", "ca");

        Cat cat2 = new Cat("meo trang");
        Cat cat3 = new Cat("meo vang", 2);
        cat1.keu();

        System.out.println(cat1.toString());

       // cat1.name = "meo nau";
        cat1.setName("meo nau");
        System.out.println(cat1.getName());

    }
}
