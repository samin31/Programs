import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "admin123";

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(username)) {
            if (pass.equals(password)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Incorrect Password");
            }
        } else {
            System.out.println("Invalid Username");
        }

        sc.close();
    }
}