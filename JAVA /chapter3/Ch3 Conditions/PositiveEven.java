import java.util.Scanner;

public class PositiveEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Positive Even Number");
            } else {
                System.out.println("Positive Odd Number");
            }
        } else {
            System.out.println("Negative Number");
        }

        sc.close();
    }
}