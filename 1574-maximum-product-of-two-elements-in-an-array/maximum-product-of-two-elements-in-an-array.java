class Solution {
    public int maxProduct(int[] nums) {
        int m=-1;
        int s=-1;
        for(int i=0;i<nums.length;i++){
            if(m<nums[i]){
                s=m;
                m=nums[i];
            }
            else if(s<nums[i]){
                s=nums[i];
            }            
        }
        int a= (m-1)*(s-1);
        return a;
    }
}