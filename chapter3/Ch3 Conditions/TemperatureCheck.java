import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temp = sc.nextInt();

        if (temp > 37) {
            System.out.println("Temperature is above normal.");
        } else {
            System.out.println("Temperature is normal.");
        }

        sc.close();
    }
}