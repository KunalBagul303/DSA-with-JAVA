public class zereone {

    public static int[] sortArray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (arr[i] == 1 && arr[j] == 0) {

                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

            if (arr[i] == 0) {
                i++;
            }

            if (arr[j] == 1) {
                j--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int arr[] = {0,0,1,1,0,0,1,1,0};

        sortArray(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}