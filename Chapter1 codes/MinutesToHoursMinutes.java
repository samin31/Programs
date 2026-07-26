import java.util.Scanner;

public class MinutesToHoursMinutes {

    static void convert(int totalMinutes) {
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total minutes: ");
        int totalMinutes = sc.nextInt();

        convert(totalMinutes);
    }
}