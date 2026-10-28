package arrays;
	public class Exercise4 {

	  
	    public static void printReverse(int[] arr) {
	        System.out.print("Samin's Reversed Array: ");
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};
	        printReverse(numbers);
	    }
	}

