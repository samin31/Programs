import java.util.Scanner;

public class TriangleValidity {

    static void checkTriangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle is not valid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        checkTriangle(a, b, c);
    }
}