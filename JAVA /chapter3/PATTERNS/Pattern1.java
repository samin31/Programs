package Chap_3pattern;

public class Ppackage Chap_3pattern;
import java.util.Scanner;

public class pyramidnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

		sc.close();
	}

}attern1 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				if((i+j)%2!=0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}