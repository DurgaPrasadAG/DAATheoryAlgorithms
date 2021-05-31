class MatrixMultiplication {
    
    /**
     * Implmentation of Matrix Multiplication Algorithm
     * @param matrixA - 2D Array of matrix A
     * @param matrixB - 2D Array of matrix B
     * @return - result of Matrix A * Matrix b
     */
    int[][] matrixMultiplication(int matrixA[][], int matrixB[][]) {
        int[][] result = new int[matrixA.length][matrixB.length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < result.length; k++) {
                    result[i][j] = result[i][j] + matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {7, 8, 9},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        var matrixMul = new MatrixMultiplication();
        int[][] result = matrixMul.matrixMultiplication(matrixA, matrixB);
        
        System.out.println("Matrix Multiplication : ");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }    
}
