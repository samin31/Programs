package Switchcase;
import java.util.Scanner;

public class ElectricityBill {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("1. Domestic");
	        System.out.println("2. Commercial");
	        System.out.println("3. Industrial");

	        System.out.print("Enter connection type: ");
	        int type = sc.nextInt();

	        switch(type){
	            case 1:
	                System.out.println("Rate: Rs.5 per unit");
	                break;
	            case 2:
	                System.out.println("Rate: Rs.8 per unit");
	                break;
	            case 3:
	                System.out.println("Rate: Rs.10 per unit");
	                break;
	            default:
	                System.out.println("Invalid Type");
	        }
	    }
	}
