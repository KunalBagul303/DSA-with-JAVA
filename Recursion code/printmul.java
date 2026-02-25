import java.util.*;

public class printmul {

    public static void printMultiplication(int n, int k) {

        // Base condition (recursion k pe chal raha hai)
        if (k == 0) {
            return;
        }

        // Recursive call
        printMultiplication(n, k - 1);

        // Self work
        System.out.println(n * k);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        // Function call
        printMultiplication(n, k);

        sc.close();
    }
}