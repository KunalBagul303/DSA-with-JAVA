import java.util.Scanner;

public class main {

    public static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;

        if (n < k) return 0;

        int windowSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // sliding window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();   // window size

        System.out.println(maxSubarraySum(arr, k));

        sc.close();
    }
}