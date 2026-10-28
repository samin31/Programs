import java.util.Scanner;

public class StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Very Good");
        } else if (marks >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }

        sc.close();
    }
}