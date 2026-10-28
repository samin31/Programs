import java.util.Scanner;

public class SimplePercentage {

    static double calculatePercentage(double marks, double total) {
        return (marks / total) * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter obtained marks: ");
        double marks = sc.nextDouble();

        System.out.print("Enter total marks: ");
        double total = sc.nextDouble();

        double percentage = calculatePercentage(marks, total);

        System.out.println("Percentage = " + percentage + "%");
    }
}