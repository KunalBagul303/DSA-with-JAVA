

public class DiagonalSum {

    public static int diagonalSumMatrix(int matrix[][]) {
        int sum = 0;

        // for (int i = 0; i < matrix.length; i++) { -----this method is large TC
        //     for (int j = 0; j < matrix[0].length; j++) {

        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        for( int i=0; i<matrix.length; i++){
            //pd
            sum += matrix[i][i];
            //sd
            sum += matrix[i][matrix.length-i-1];
        }
        return sum;
    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int result = diagonalSumMatrix(matrix);
        System.out.println("Diagonal Sum = " + result);
    }
}
