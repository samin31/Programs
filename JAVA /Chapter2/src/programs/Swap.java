package programs;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int temp=a;
a=b;
 b=temp;
System.out.println("After Swapping:");
System.out.println("a="+a);
	System.out.println("b="+b);

}
}