import java.util.Scanner;

public class HoursToSeconds {
    
    static int convertToSeconds(int hours) {
        return hours * 60 * 60;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = sc.nextInt();

        int seconds = convertToSeconds(hours);

        System.out.println("Seconds: " + seconds);
    }
}