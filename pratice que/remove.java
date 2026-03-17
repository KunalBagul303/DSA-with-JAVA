public class remove {

    public static int REMOOV(int nums[] ){
         int j =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,3,3,4,4,4,5,5,5};
        System.out.println(REMOOV(nums));
    }
}
