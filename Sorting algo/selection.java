

public class selection {


    public static void Selectionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }


        public static void printarr(int arr[] ) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1};
        Selectionsort(arr);
        printarr(arr);
    }
}
