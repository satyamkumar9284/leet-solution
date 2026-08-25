class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int can[]=new int[n];
        int m=candies[0];
        for(int i=0;i<n;i++){
            can[i]=candies[i]+extraCandies;
        }
        List<Boolean> result = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(candies[i]>m){
                m=candies[i];
            }}
            for(int i=0;i<n;i++){
            result.add(can[i]>=m);
            }               
        
        return result;
    }
    }
