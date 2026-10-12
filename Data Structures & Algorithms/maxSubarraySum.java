class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low = 0;
        int high = k-1;
        int currSum = 0;
        int res = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i=low; i<= high; i++){
            currSum = currSum + arr[i];
        }
        
        
        while(high < n){
            res = Math.max(res, currSum);
            low++;
            high++;
            currSum = currSum - arr[low-1];
            if(high == n){
                break;
            }
            currSum = currSum + arr[high];
        }
        return res;
        
    }
}
