package chapter4;

class Student {
    String name;
    int age;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 18;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}