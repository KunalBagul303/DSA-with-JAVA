public class numocc {
    public static void main(String[] args) {

        // Input Array
        int[] arr = {1, 2, 4, 4, 4, 6};

        // Target element
        int target = 4;

        // Lower Bound
        int start = 0;
        int end = arr.length - 1;
        int lowerBound = arr.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                lowerBound = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Upper Bound
        start = 0;
        end = arr.length - 1;
        int upperBound = arr.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                upperBound = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Number of Occurrences
        int count = upperBound - lowerBound;

        System.out.println("Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Target: " + target);
        System.out.println("Number of Occurrences: " + count);
    }
}