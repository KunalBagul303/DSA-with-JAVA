public class recerse {

    public static int  reversearrr(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i <= j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int k : arr){
            System.out.println(k);
        }
        return 0;
    }



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int ans = reversearrr(arr);
        System.out.println(ans);
    }
}
