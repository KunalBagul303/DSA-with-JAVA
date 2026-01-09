import java.util.Arrays;



public class inbuit {

        public static void printarr(int arr[] ) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1};
        Arrays.sort(arr);
        printarr(arr);
    }
}
