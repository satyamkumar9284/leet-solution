class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        int c=1;
        int b=1;
        int j=0;
        int d=1;
    
        for (int i=0;i<n;i++){
            b*=nums[i];
            if(nums[i]==0){
                for(j=i+1;j<n;j++){
                    d*= nums[j];
                }
            }
        }
        j=0;
        while(j<n && nums[j]!=0){
           c*=nums[j];
            j++;
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                a[i]=c*d;
            }
            else{
            a[i]=b/nums[i];
            }
        }
        return a;

    }
}