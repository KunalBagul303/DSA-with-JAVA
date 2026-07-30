public class intersectionn {

    public static void intersection(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE; // Duplicate print hone se bachane ke liye
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        intersection(arr1, arr2);
    }
}