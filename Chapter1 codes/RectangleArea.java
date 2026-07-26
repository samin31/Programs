import java.util.Scanner;

public class RectangleArea {

    static double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double l = sc.nextDouble();

        System.out.print("Enter Width: ");
        double w = sc.nextDouble();

        System.out.println("Area = " + area(l, w));
    }
}