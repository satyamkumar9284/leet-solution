class Solution {
    public int searchInsert(int[] num, int t) {
        int l=0;
        int r= num.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(num[m]==t){
                return m;
            }
            else if(num[m]<t){
                l=m+1;
            }
            else{
                r=m-1;
            }

        }
        return l;
    } 
    
}