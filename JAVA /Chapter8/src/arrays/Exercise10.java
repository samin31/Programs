package arrays;

public class Exercise10 {

	
	    public static int[][] getTranspose(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int[][] transpose = new int[cols][rows];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transpose[j][i] = matrix[i][j];
	            }
	        }
	        return transpose;
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        int[][] transposedMatrix = getTranspose(matrix);

	        System.out.println("Samin's Transposed Matrix (Rows -> Columns):");
	        for (int[] row : transposedMatrix) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	    }
	
}
