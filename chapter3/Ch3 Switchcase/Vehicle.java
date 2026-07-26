package Switchcase;
import java.util.Scanner;

public class Vehicle {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("1. Bike");
	        System.out.println("2. Car");
	        System.out.println("3. Bus");
	        System.out.println("4. Truck");

	        System.out.print("Enter choice: ");
	        int choice = sc.nextInt();

	        switch(choice){
	            case 1:
	                System.out.println("Two Wheeler");
	                break;
	            case 2:
	                System.out.println("Four Wheeler");
	                break;
	            case 3:
	                System.out.println("Public Transport");
	                break;
	            case 4:
	                System.out.println("Goods Vehicle");
	                break;
	            default:
	                System.out.println("Invalid Choice");
	        }
	    }
	

}
