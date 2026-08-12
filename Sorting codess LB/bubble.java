public class bubble {
    public static void main(String[] args) {

        // Input
        int[] nums = {5, 6, 3, 1, 2};

        int n = nums.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Output
        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}