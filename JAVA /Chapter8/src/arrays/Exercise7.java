package arrays;

public class Exercise7 {

	   
	    public static void sortAscending(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = {64, 25, 12, 22, 11};

	        sortAscending(numbers);

	        System.out.print("Samin's Sorted Array: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	
}
