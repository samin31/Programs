package chapter4;
import java.util.Scanner;

class Employee {
    String name;
    int age;
    double salary;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter age: ");
        emp.age = sc.nextInt();

        System.out.print("Enter salary: ");
        emp.salary = sc.nextDouble();

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Salary: " + emp.salary);
    }
}