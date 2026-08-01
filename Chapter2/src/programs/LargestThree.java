package programs;
import java.util.Scanner;
public class LargestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>=b && a>=c)
	System.out.println("a is Largest Number");
if(b>=a && b>=c)
	System.out.println("b is Largest Number");
else
	System.out.println("c is Largest Number");}

}
