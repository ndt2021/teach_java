package chuong6.phan1;

public class Cat{
    // thuoc tinh
    private String name;
    private int age;
    private float weight;
    private String color;
    private String favoriteFood;

    // constructor

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age, float weight, String color, String favoriteFood){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.favoriteFood = favoriteFood;
    }

    public void keu(){
        System.out.println("meo meo");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
