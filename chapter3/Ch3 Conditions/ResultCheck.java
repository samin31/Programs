import java.util.Scanner;

public class ResultCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Mark: ");
        int num = sc.nextInt();

        if (num >=35) {
            System.out.println("Pass.");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}