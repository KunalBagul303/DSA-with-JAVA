import java.util.*;

public class books {

    // Check karta hai ki maxPages ke andar
    // k students ko books allocate ho sakti hain ya nahi
    public static boolean isValidAnswer(int[] arr, int k, long maxPages) {

        // Agar books students se kam hain
        if (arr.length < k) {
            return false;
        }

        int studentCount = 1;
        long pages = 0;

        // Har book ko ek-ek karke allocate karenge
        for (int i = 0; i < arr.length; i++) {

            // Agar current student ko book dene ke baad
            // maxPages cross nahi ho raha
            if (pages + arr[i] <= maxPages) {

                pages += arr[i];
            }

            // Agar maxPages cross ho raha hai
            else {

                // Next student ko book denge
                studentCount++;

                // Agar students k se zyada ho gaye
                if (studentCount > k) {
                    return false;
                }

                // New student ko current book se start karenge
                pages = arr[i];
            }
        }

        return true;
    }


    public static int findPages(int[] arr, int k) {

        int n = arr.length;

        // Agar books students se kam hain
        if (n < k) {
            return -1;
        }

        // Minimum possible answer
        // = array ka maximum element
        long start = 0;

        for (int i = 0; i < n; i++) {
            start = Math.max(start, arr[i]);
        }

        // Maximum possible answer
        // = saari books ke pages ka sum
        long end = 0;

        for (int i = 0; i < n; i++) {
            end += arr[i];
        }

        long ans = -1;

        // Binary Search
        while (start <= end) {

            long mid = start + (end - start) / 2;

            // Check karo mid valid answer hai ya nahi
            if (isValidAnswer(arr, k, mid)) {

                // mid valid hai
                ans = mid;

                // Aur smaller answer dhoondho
                end = mid - 1;
            }

            else {

                // mid valid nahi hai
                // pages limit badhani padegi
                start = mid + 1;
            }
        }

        return (int) ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of books
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        // Array input
        int[] arr = new int[n];

        System.out.println("Enter pages of each book:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Number of students
        System.out.print("Enter number of students: ");
        int k = sc.nextInt();

        // Find minimum maximum pages
        int answer = findPages(arr, k);

        System.out.println("Minimum maximum pages = " + answer);

        sc.close();
    }
}