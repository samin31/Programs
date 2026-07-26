import java.util.Scanner;

public class SquarePerimeter {

    static double perimeter(double side) {
        return 4 * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side: ");
        double side = sc.nextDouble();

        System.out.println("Perimeter = " + perimeter(side));
    }
}