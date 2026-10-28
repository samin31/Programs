package arrays;
	import java.util.Scanner;

	public class DisplayMarks{

	    public static int[][] createMatrix(Scanner sc, int rows, int cols) {
	        int[][] matrix = new int[rows][cols];
	        System.out.println("Enter elements for a " + rows + "x" + cols + " matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                matrix[i][j] = sc.nextInt();
	            }
	        }
	        return matrix;
	    }

	    public static void printMatrix(int[][] matrix) {
	        System.out.println("\nFormatted Matrix Output:");
	        for (int[] row : matrix) {
	            for (int val : row) {
	                System.out.print(val + "\t");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[][] myMatrix = createMatrix(sc, 3, 3);
	        printMatrix(myMatrix);
	        sc.close();
	    }
	
}
