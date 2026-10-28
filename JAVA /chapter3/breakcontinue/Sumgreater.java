package breakcontinue;

public class Sumgreater {
	
	    public static void main(String[] args) {

	        int sum = 0;

	        for (int i = 1; i <= 20; i++) {

	            sum = sum + i;

	            if (sum > 50) {
	                break;
	            }

	            System.out.println(i);
	        }

	        System.out.println("Sum = " + sum);
	    }
	
}
