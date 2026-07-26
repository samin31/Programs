package Switchcase;
import java.util.Scanner;
public class Season {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter season number (1-4): ");
	        int n = sc.nextInt();

	        switch(n){
	            case 1:
	                System.out.println("Summer");
	                break;
	            case 2:
	                System.out.println("Rainy");
	                break;
	            case 3:
	                System.out.println("Winter");
	                break;
	            case 4:
	                System.out.println("Spring");
	                break;
	            default:
	                System.out.println("Invalid Choice");
	        }
	    }
	

}
