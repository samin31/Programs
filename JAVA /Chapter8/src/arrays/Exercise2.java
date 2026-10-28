package arrays;
	public class Exercise2 {

	 
	    public static int calculateSum(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};
	        
	        int total = calculateSum(numbers);
	        System.out.println("Hello Samin, the total sum of elements is: " + total);
	    }
	
}
