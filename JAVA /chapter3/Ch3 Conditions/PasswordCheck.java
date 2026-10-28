import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password = "admin123";

        System.out.print("Enter password: ");
        String input = sc.nextLine();

        if (input.equals(password)) {
            System.out.println("Password is Correct.");
        } else {
            System.out.println("Password is Incorrect.");
        }

        sc.close();
    }
}