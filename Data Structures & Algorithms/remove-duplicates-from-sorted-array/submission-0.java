class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int i = 0;
        int j = 1;
        

        while(i < j && j < nums.length){

         while(j < nums.length && nums[i] == nums[j]){
            j++;
          }
        if(j < nums.length){
             nums[i+1] = nums[j];
              i++;
              j++;
             k++;

        }
       
       
        
        }
        return k;
        
    }
}