class Solution {
    public int maxAscendingSum(int[] nums) {

        int m=nums[0];
        int c=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                c+=nums[i];
            }
            else{
                m=Math.max(m,c);
                c= nums[i];
            }
        }
        m=Math.max(m,c);
        
        return m;
    }
}