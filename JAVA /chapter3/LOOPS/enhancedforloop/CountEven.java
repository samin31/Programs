package enhancedforloop;

public class CountEven {
	
	    public static void main(String[] args) {
	        int[] arr = {10, 15, 20, 25, 30};
	        int count = 0;

	        for (int num : arr) {
	            if (num % 2 == 0) {
	                count++;
	            }
	        }

	        System.out.println("Even Numbers = " + count);
	    }
	
}
