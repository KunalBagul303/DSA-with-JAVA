import java.util.*;

public class Main {

    public static List<Integer> rowSums(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        List<Integer> result = new ArrayList<>();

        for (int row = 0; row < m; row++) {

            int sum = 0;

            for (int col = 0; col < n; col++) {
                sum = sum + arr[row][col];
            }

            result.add(sum);
        }

        return result;
    }

    public static void main(String[] args) {

        // Input
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Function call
        List<Integer> result = rowSums(arr);

        // Output
        System.out.println(result);
    }
}