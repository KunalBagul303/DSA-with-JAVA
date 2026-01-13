public class SortedSquares {

    public static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        int[] ans = new int[n];
        int k = n - 1; // fill from end

        while (left <= right) {
            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if (leftSq > rightSq) {
                ans[k--] = leftSq;
                left++;
            } else {
                ans[k--] = rightSq;
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};

        int[] result = sortSquares(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
