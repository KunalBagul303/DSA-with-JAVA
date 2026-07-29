public class multi10 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int size = arr.length;
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }

        // Print the new array
        for (int i = 0; i < size; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}