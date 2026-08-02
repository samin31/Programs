package dowhileloop;

	import java.util.Scanner;

	public class PrimeNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int i = 2;
	        boolean prime = true;

	        do {
	            if (n % i == 0) {
	                prime = false;
	                break;
	            }
	            i++;
	        } while (i < n);

	        if (n <= 1)
	            prime = false;

	        if (prime)
	            System.out.println("Prime Number");
	        else
	            System.out.println("Not a Prime Number");
	    }
	}
