class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int []ans = new int [q.length];
        int k=0;
        for(int i=0;i<q.length;i++){
            int s=q[i][0],e=q[i][1];
            int curr =0;
            while(s<=e) curr^=arr[s++];
            ans[k]=curr;
            k++;
        }
        return ans;
    }
}