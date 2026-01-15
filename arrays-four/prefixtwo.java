public class prefixtwo {

    public static int[] prefixsumarr(int arr[]) {
        int n = arr.length;
        int[] pref = new int[n];

        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        return pref; // ✅ correct
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 7, 8, 9};

        int result[] = prefixsumarr(arr);

        // print prefix sum array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

