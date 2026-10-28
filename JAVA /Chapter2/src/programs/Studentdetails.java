package programs;
import java.util.Scanner;

public class Studentdetails {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Marks: ");
	        int marks = sc.nextInt();

	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);
	    }
	}
