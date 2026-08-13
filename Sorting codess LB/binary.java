public class binary {

    public static int search(int[] nums, int target) {

        int n = nums.length;
        int start = 0;
        int end = n - 1;

        int mid = start + (end - start) / 2;

        while (start <= end) {

            // compare target with mid
            if (nums[mid] == target) {
                return mid;
            }

            else if (target > nums[mid]) {
                // go to the right side of array
                start = mid + 1;
            }

            else {
                // go to the left side of array
                end = mid - 1;
            }

            // update mid
            mid = start + (end - start) / 2;
        }

        // agar target exist nahi karta to -1 return hoga
        return -1;
    }

    public static void main(String[] args) {

        // Array
        int[] nums = {2, 5, 7, 9, 11, 15};

        // Target
        int target = 9;

        // Binary Search
        int result = search(nums, target);

        // Output
        System.out.println("Target index: " + result);
    }
}