package arrays;

public class Exercise6 {

	    
	    public static int searchElement(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return i; 
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 25, 30, 45, 50};
	        int target = 30;

	        int index = searchElement(numbers, target);

	        if (index != -1) {
	            System.out.println("Samin, element " + target + " was found at index: " + index);
	        } else {
	            System.out.println("Samin, element " + target + " was not found.");
	        }
	    }
	}

