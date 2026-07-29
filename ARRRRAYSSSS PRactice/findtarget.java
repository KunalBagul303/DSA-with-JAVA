public class findtarget {

    public static boolean findTarget(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 7, 5, 6};
        int target = 7;

        boolean ans = findTarget(arr, target);

        System.out.println(ans);
    }
}