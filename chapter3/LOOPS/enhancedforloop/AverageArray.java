package enhancedforloop;

public class AverageArray {

	
	    public static void main(String[] args) {
	        double[] arr = {10.5, 20.5, 30.0, 40.0};
	        double sum = 0;

	        for (double num : arr) {
	            sum += num;
	        }

	        double average = sum / arr.length;

	        System.out.println("Average = " + average);
	    
	}}
