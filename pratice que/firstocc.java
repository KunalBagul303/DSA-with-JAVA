public class firstocc {

    public static int fristoccureasns(int arr[], int key, int i){
        if( i == arr.length) {
            return -1;
        }
        
        if(key == arr[i]){
            return i;
        }

        return fristoccureasns(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 5;
        System.out.println(fristoccureasns(arr, 5, 0));

    }
}
 