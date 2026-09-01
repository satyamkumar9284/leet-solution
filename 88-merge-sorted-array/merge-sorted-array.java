class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t[]=new int[m+n];
        for(int i=0;i<m;i++){
        t[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            t[i+m]=nums2[i];
        }
        Arrays.sort(t);
        for(int i=0;i<m+n;i++){
            nums1[i]=t[i];
        }
    }
}