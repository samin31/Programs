package arrays;
	public class Exercise3 {

	    public static int[][] addMatrices(int[][] a, int[][] b) {
	        int rows = a.length;
	        int cols = a[0].length;
	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = a[i][j] + b[i][j];
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int[][] matrixA = {{1, 2}, {3, 4}};
	        int[][] matrixB = {{5, 6}, {7, 8}};

	        int[][] sumMatrix = addMatrices(matrixA, matrixB);

	        System.out.println("Samin's Added Matrix Result:");
	        for (int[] row : sumMatrix) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	    }
	
}
