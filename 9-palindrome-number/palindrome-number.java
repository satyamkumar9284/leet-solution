class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        if (x<0){
            return false;
        }
        else{
            int n=x;
            while(n>0){
                r*=10;
            r+=n%10;
            
            n/=10;
        }}
        return r==x;
        
    }
}