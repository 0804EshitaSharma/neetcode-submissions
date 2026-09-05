class Solution {
    public int findSum(int[] nums){
         int sum = 0;
         for(int i=0;i<nums.length ; i++){
            sum += nums[i];
            }
            return sum;
        
    }
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        int sum = findSum(nums);

        if( sum == nums[0]){
            return 0;
        }
        for(int i=1;i<nums.length ; i++){
            left = left + nums[i-1]; //2
            right  = sum - left - nums[i];// 2 - 2-1 = 0-1 =-1
            if(left == right){
                return i;
            }
        }
        return -1;

    }
}