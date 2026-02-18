import java.util.Arrays;

public class let179 {

    public static String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        // Convert int to String
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sort
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if largest element is "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        int[] nums = {3, 30, 34, 5, 9};

        String answer = largestNumber(nums);

        System.out.println(answer);
    }
}
