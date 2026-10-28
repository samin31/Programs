package arrays;

	public class Exercise1 {

	   
	    public static int findLargest(int[] arr) {
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {15, 42, 8, 91, 23};
	        
	        System.out.println("Hello Samin, processing your array...");
	        int largest = findLargest(numbers);
	        System.out.println("Samin's Largest Number: " + largest);
	    }
	}

