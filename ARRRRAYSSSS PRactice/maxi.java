public class maxi {


        public static int maxi(int[] arr) {
           int maxi = arr[0];
           for(int i=0; i<arr.length; i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
           }
           return maxi;
        }





    public static void main(String[] args) {
        int[]  arr = {2,3,4,5,6,7,8,9};
       
         int ans = maxi(arr);
         System.out.println(ans);

    }

}

