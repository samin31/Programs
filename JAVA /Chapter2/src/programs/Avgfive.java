package programs;
import java.util.Scanner;

public class Avgfive {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d = sc.nextInt();
	        int e = sc.nextInt();

	        double avg = (a + b + c + d + e) / 5.0;

	        System.out.println("Average = " + avg);
	    }
	}

