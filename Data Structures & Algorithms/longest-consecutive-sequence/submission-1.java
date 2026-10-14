class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i : nums){
           if(!map.containsKey(i-1)){
            int length = 0;
            int n = i;

            while(map.containsKey(n)){
                length++;
                 n++;
            }
            res = Math.max(res,length);

           }
        }

        return res;
    }
}
