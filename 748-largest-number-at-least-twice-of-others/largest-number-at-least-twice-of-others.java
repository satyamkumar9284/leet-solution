class Solution {
    public int dominantIndex(int[] nums) {
        int a=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(a<=nums[i]){
                a=nums[i];
                m=i;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(i==m) continue;
            if(a<nums[i]*2){
                return -1;
        }
        
        
    }
    return m;
}}