class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
            for(int i=0;i<mat.length;i++){
                for(int k=0;k<mat.length;k++){
                    if(k==i){
                    s+=mat[k][k];
                    if(mat.length-1-i!=i){
                    s+=mat[i][mat.length-1-i];
                    }
                     }
                                   }
            }
            return s;
    }
}