package chuong6.phan5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Meo den", 3, 3.5f);
        Pet pet2 = new Pet("meo trang");
        Pet pet3 = new Pet("meo vang", 2);
//        System.out.println(pet1.toString());
//        System.out.println(pet2.toString());
//        System.out.println(pet3.toString());
//
//        Pet.keu();
//        System.out.println(Pet.Loai);
//        System.out.println(pet1.Loai);

        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);

        for (int i=0; i<pets.size(); i++) {
            System.out.println(pets.get(i).toString());
        }


    }
}
