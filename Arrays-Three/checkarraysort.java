public class checkarraysort {

    public static boolean checkarrsort(int numbers[]) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 6, 7, 8};
        System.out.println("Is array sorted? " + checkarrsort(numbers));
    }
}
