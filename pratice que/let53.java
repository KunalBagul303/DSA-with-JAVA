public class let53 {

    public static int subarrmax(int[] nums){
         int currsum = nums[0];
         int max = nums[0];

        for(int i=1; i<nums.length; i++){
            if(currsum + nums[i] > nums[i]){
                currsum+=nums[i];
            }else{
                currsum = nums[i];
            }
            max = Math.max(max , currsum);
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] nums = {2,3,1,4,-2,3,-7,9,7};
        subarrmax(nums);
    }
}