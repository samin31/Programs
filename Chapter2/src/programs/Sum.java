package programs;
import java.util.Scanner;
public class Sum {
	static int add(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		{
System.out.println("Enter the first Number:");
int num1=sc.nextInt();
System.out.println("Enter the Second Number:");
int num2=sc.nextInt();

int result=add(num1,num2);
System.out.println("sum:"+result);
sc.close();
}
}
}