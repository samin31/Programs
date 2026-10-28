package enhancedforloop;

public class LargestElement {

	
	    public static void main(String[] args) {
	        int[] arr = {15, 8, 40, 25, 10};

	        int max = arr[0];

	        for (int num : arr) {
	            if (num > max) {
	                max = num;
	            }
	        }

	        System.out.println("Largest = " + max);
	    
	}}
