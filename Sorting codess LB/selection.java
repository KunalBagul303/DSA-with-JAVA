public class selection {

    static void selectionSort(int arr[]) {

        // outer loop for rounds
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // inner loop -> comparison
            for(int j = i + 1; j < n; j++) {

                if(arr[j] < arr[minIndex]) {

                    minIndex = j;
                }
            }

            // jab mera comparison complete ho jayega
            // to minIndex wali value ko correct position
            // par rakhna hai

            // swap arr[i], arr[minIndex]

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        // Input
        int arr[] = {5, 6, 4, 1, 3};

        // Selection Sort call
        selectionSort(arr);

        // Output
        System.out.println("Sorted Array:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}