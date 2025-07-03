class Solution {
    public int findTheWinner(int n, int k) {
        // boolean arr[] = new boolean[n];
        // return solve(arr,k,0)
        int ans=0;
        for(int i=1;i<=n;i++) ans=(ans+k)%i;
        return ans+1;
    }
    // int solve(int []arr,int k,int i){
    //     if()

    //     return solve(arr,k,i+1);
    // }
}