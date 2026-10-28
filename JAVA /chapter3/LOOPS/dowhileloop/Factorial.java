package dowhileloop;

	import java.util.Scanner;

	public class Factorial {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int fact = 1;

	        do {
	            fact = fact * n;
	            n--;
	        } while (n > 0);

	        System.out.println("Factorial = " + fact);
	    }
	}

