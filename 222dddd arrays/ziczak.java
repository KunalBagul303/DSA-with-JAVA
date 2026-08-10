import java.util.*;

public class ziczak {

    public static List<Integer> wavePrintMatrix(int[][] matrix, int m, int n) {

        // List<Integer> result = new ArrayList<>();

        // // lets move column wise
        // for (int col = 0; col < n; col++) {

        //     // har ek column index ko check kro for even/odd
        //     if ((col & 1) == 1) {

        //         // odd
        //         // bottom to top
        //         for (int row = m - 1; row >= 0; row--) {
        //             result.add(matrix[row][col]);
        //         }

        //     } else {

        //         // even
        //         // top to bottom
        //         for (int row = 0; row < m; row++) {
        //             result.add(matrix[row][col]);
        //         }
        //     }
        // }

        // return result;

        List<Integer> result = new ArrayList<>();
        for(int col=0; col<n; col++){
            if((col & 1 )== 1){
                for(int row=m-1; row>=0; row--){
                result.add(matrix[row][col]);
            }
            }else{
                for(int row=0; row<m; row++){
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
        
    }

    public static void main(String[] args) {

        // Input
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int m = 3;
        int n = 3;

        // Wave Print
        List<Integer> result = wavePrintMatrix(matrix, m, n);

        System.out.println(result);
    }
}