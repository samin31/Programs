import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter light (Red/Yellow/Green): ");
        String light = sc.nextLine();

        if (light.equalsIgnoreCase("Red")) {
            System.out.println("Stop");
        } else if (light.equalsIgnoreCase("Yellow")) {
            System.out.println("Ready");
        } else if (light.equalsIgnoreCase("Green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid Signal");
        }

        sc.close();
    }
}