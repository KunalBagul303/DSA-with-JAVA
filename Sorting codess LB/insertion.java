public class insertion {

    static void insertionSort(int arr[]) {

        int n = arr.length;

        for(int i = 1; i < n; i++) {

            int curr = i;
            int prev = i - 1;
            int currValue = arr[i];

            // shifting
            while(prev >= 0 && currValue < arr[prev]) {

                arr[prev + 1] = arr[prev];

                prev--;
            }

            // ab humare paas ek khaali jagah aa chuki hai
            // place the currentValue
            arr[prev + 1] = currValue;
        }
    }

    public static void main(String[] args) {

        // Input
        int arr[] = {4, 1, 5, 2, 3};

        // Insertion Sort call
        insertionSort(arr);

        // Output
        System.out.println("Sorted Array:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}