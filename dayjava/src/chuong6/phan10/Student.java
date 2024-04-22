package chuong6.phan10;

class Student {
    private String fullName;
    private String address;
    private String email;
    private float gpa;
    private int age;

    public Student() {
    }

    public Student(String fullName, String address, String email, float gpa, int age) {
        this.setFullName(fullName);
        this.setAddress(address);
        this.setEmail(email);
        this.setGpa(gpa);
        this.setAge(age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}