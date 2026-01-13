public class SortOddEven {

    public static void sortOddEvenArr(int arr[]) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            if (arr[left] % 2 == 0) {
                left++;
            }

            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,8,9,11,14,15,16,12};

        sortOddEvenArr(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
