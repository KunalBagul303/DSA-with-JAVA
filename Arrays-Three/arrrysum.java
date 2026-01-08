
public class arrrysum {

    public static int ArraysSumtotal(int n[]) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int n[] = {3, 4, 5, 6, 6, 7, 5, 3, 5};
        System.out.println(ArraysSumtotal(n));
    }
}
