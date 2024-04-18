package chuong6.phan5;

public class Pet {
    private String name; // tên
    private float age;
    private float weight;

    public static String Loai = "PetPuppy";

    public Pet(String name, float age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Pet(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static void keu(){
        System.out.println("keu 2222222");
    }


}
