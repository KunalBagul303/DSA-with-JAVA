public class SortedOneZero {

    public static void zeroOneSort(int arr[]) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                // swap values
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            if (arr[left] == 0) {
                left++;
            }

            if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,0,0,1,1,0,0,1,0,1,1};
        zeroOneSort(arr);

        // print array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
