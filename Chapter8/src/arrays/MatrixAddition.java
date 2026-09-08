package arrays;

public class MatrixAddition {
	    public static void main(String[] args) {
	        int[][] matrixA = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        int[][] matrixB = {
	            {7, 8, 9},
	            {1, 2, 3}
	        };

	        int rows = matrixA.length;
	        int cols = matrixA[0].length;
	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = matrixA[i][j] + matrixB[i][j];
	            }
	        }

	        System.out.println("Sum of Matrix A and Matrix B:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	
}
