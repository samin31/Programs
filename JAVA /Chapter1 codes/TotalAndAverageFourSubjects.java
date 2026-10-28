import java.util.Scanner;

public class TotalAndAverageFourSubjects {

    static void calculate(int s1, int s2, int s3, int s4) {
        int total = s1 + s2 + s3 + s4;
        double average = total / 4.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first subject mark: ");
        int s1 = sc.nextInt();

        System.out.print("Enter second subject mark: ");
        int s2 = sc.nextInt();

        System.out.print("Enter third subject mark: ");
        int s3 = sc.nextInt();

        System.out.print("Enter fourth subject mark: ");
        int s4 = sc.nextInt();

        calculate(s1, s2, s3, s4);
    }
}