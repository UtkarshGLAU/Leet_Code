class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int ans [] = new int[q.length];
        int p [] = new int [arr.length];
        p[0]=arr[0];
        for(int i=1;i<arr.length;i++) p[i]=p[i-1]^arr[i];

        for(int i=0;i<ans.length;i++){
            int s = q[i][0],e=q[i][1];
            if(s==0){
                ans[i]=p[e];
            } else {
                ans[i]=p[e]^p[s-1];
            }
        }
        return ans;

    }
}