package arrays;

public class Exercise5 {
	    public static int findSecondLargest(int[] arr) {
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }
	        return secondLargest;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {12, 35, 1, 10, 34, 1};
	        
	        int secondMax = findSecondLargest(numbers);
	        System.out.println("Hey Samin, the Second Largest Number is: " + secondMax);
	    }
	}

