package Switchcase;
import java.util.Scanner;

public class Restaurant {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("1. Dosa");
	        System.out.println("2. Idly");
	        System.out.println("3. Poori");
	        System.out.println("4. Biryani");

	        System.out.print("Choose your food: ");
	        int choice = sc.nextInt();

	        switch(choice){
	            case 1:
	                System.out.println("Dosa - Rs.50");
	                break;
	            case 2:
	                System.out.println("Idly - Rs.30");
	                break;
	            case 3:
	                System.out.println("Poori - Rs.40");
	                break;
	            case 4:
	                System.out.println("Biryani - Rs.150");
	                break;
	            default:
	                System.out.println("Item Not Available");
	        }
	    }
	}


