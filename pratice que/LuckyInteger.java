import java.util.HashMap;
import java.util.Scanner;

public class LuckyInteger {

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLucky = -1;

        // Check lucky numbers
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                maxLucky = Math.max(maxLucky, key);
            }
        }

        return maxLucky;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findLucky(arr);

        System.out.println("Largest Lucky Integer: " + result);

        sc.close();
    }
}
