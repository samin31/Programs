import java.util.Scanner;

public class CelsiusToKelvin {

    static double convert(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double kelvin = convert(celsius);

        System.out.println("Kelvin = " + kelvin);
    }
}