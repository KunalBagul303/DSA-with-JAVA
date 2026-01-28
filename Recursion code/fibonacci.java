
public class fibonacci {

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;  // ✅ plus
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
