import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Subject 1 Marks: ");
        int s1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int s2 = sc.nextInt();

        if (s1 >= 35) {
            if (s2 >= 35) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail in Subject 2");
            }
        } else {
            System.out.println("Fail in Subject 1");
        }

        sc.close();
    }
}