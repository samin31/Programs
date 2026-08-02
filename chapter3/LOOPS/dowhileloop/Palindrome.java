package dowhileloop;
	import java.util.Scanner;

	public class Palindrome {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int temp = n;
	        int reverse = 0;

	        do {
	            int digit = temp % 10;
	            reverse = reverse * 10 + digit;
	            temp = temp / 10;
	        } while (temp > 0);

	        if (reverse == n)
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	    
	}
}
