package arrays;
	import java.util.Scanner;

	public class Exercise9 {

	  
	    public static void displayMatrix(int[][] matrix) {
	        System.out.println("\nSamin's Formatted 2D Matrix:");
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Samin, enter number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Samin, enter number of columns: ");
	        int cols = sc.nextInt();

	        int[][] matrix = new int[rows][cols];

	        System.out.println("Enter matrix elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                matrix[i][j] = sc.nextInt();
	            }
	        }

	        displayMatrix(matrix);
	        sc.close();
	    }
	
}
