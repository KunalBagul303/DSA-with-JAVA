public class twosum {

    public static int twosumarr(int arr[], int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,5,3,5,6,7,4,5,9};
        int target = 11;

        System.out.println("Total pairs with target sum: " + twosumarr(arr, target));
    }
}
