import java.util.Scanner;

public class prefix {

    // Easy prefix: modifies the same array
    public static int[] easyprefix(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2, 3, 5, 4, 7, 8, 9};

        int result[] = easyprefix(arr);  // prefix array ready

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter range (l r): ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            // If l = 0 (first index)
            int ans = 0;
            if (l == 0) {
                ans = result[r];
            } else {
                ans = result[r] - result[l - 1];
            }

            System.out.println("Sum = " + ans);
        }

        sc.close();
    }
}
