class Solution {
    public int maxSubArray(int[] nums) {

       

         int res = nums[0];
         int best = nums[0];
        for( int i=1; i < nums.length ; i++){
           
            int option1 = best + nums[i];
            int option2 = nums[i] ;
            best = Math.max(option1,option2);
            res = Math.max(best, res);

        }
        return res;
    }
}
