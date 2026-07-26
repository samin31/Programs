import java.util.Scanner;

public class LargestNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is Largest");
            } else {
                System.out.println(c + " is Largest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is Largest");
            } else {
                System.out.println(c + " is Largest");
            }
        }

        sc.close();
    }
}