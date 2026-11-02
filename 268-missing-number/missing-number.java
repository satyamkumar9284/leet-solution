class Solution {
    public int missingNumber(int[] nums) {
         int n=nums.length;

         int as = (n*(n+1))/2;

         int cs=0;

         for(int i=0;i<n;i++){
            cs+=nums[i];
         }

         int a=as-cs;

         return a;
        
    }
}