package arrays;

public class Exercise8 {
	    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
	        int rowsA = a.length;
	        int colsA = a[0].length;
	        int colsB = b[0].length;

	        int[][] result = new int[rowsA][colsB];

	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                for (int k = 0; k < colsA; k++) {
	                    result[i][j] += a[i][k] * b[k][j];
	                }
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int[][] matrixA = {{1, 2}, {3, 4}};
	        int[][] matrixB = {{2, 0}, {1, 2}};

	        int[][] product = multiplyMatrices(matrixA, matrixB);

	        System.out.println("Samin's Matrix Multiplication Result:");
	        for (int[] row : product) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	    }
	
}
