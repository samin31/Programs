package dowhileloop;


	import java.util.Scanner;

	public class ReverseNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int reverse = 0;

	        do {
	            int digit = n % 10;
	            reverse = reverse * 10 + digit;
	            n = n / 10;
	        } while (n > 0);

	        System.out.println("Reverse = " + reverse);
	    }
	}
