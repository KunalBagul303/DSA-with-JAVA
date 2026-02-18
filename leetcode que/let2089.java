import java.util.*;

public class let2089 {

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);  // Step 1: Sort the array
        
        List<Integer> result = new ArrayList<>();
        
        // Step 2: Traverse sorted array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);  // Step 3: Add index if target found
            }
        }
        
        return result;  // Step 4: Return result list
    }

    // For testing in VS Code
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        List<Integer> ans = targetIndices(nums, target);
        System.out.println(ans);
    }
}
