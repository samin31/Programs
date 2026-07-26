import java.util.Scanner;

public class VoteNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.print("Do you have Voter ID (true/false): ");
            boolean id = sc.nextBoolean();

            if (id) {
                System.out.println("Eligible to Vote");
            } else {
                System.out.println("Get a Voter ID");
            }
        } else {
            System.out.println("Not Eligible to Vote");
        }

        sc.close();
    }
}