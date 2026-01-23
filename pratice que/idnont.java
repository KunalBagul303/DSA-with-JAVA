class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;

        long actualSum = 0;
        long actualSqSum = 0;

        // Calculate actual sum and square sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                actualSum += val;
                actualSqSum += (long) val * val;
            }
        }

        // Expected sum and square sum
        long expectedSum = (long) total * (total + 1) / 2;
        long expectedSqSum = (long) total * (total + 1) * (2L * total + 1) / 6;

        // a - b
        long diff = actualSum - expectedSum;

        // a^2 - b^2 = (a - b)(a + b)
        long sqDiff = actualSqSum - expectedSqSum;

        // a + b
        long sum = sqDiff / diff;

        int a = (int) ((diff + sum) / 2); // repeating
        int b = (int) (sum - a);          // missing

        return new int[]{a, b};
    }
}
