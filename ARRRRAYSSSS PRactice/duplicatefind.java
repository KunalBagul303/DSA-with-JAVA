import java.util.HashMap;

public class duplicatefind {

    public static int duplicate(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Frequency store karo
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // First repeating element find karo
        for (int i : arr) {
            if (freq.get(i) > 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 3, 4, 5, 6, 7};

        System.out.println(duplicate(arr));   // Print karna padega
    }
}